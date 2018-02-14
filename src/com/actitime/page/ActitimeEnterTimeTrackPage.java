package com.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.actitime.generic.BasePage;

public class ActitimeEnterTimeTrackPage extends BasePage
{
	@FindBy(id="logoutLink")
	private WebElement logoutBTN;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement help;
	
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement about;
	
	@FindBy(xpath="//span[.='(build 40469)']")
	private WebElement verifyBuild;
	
	
	
	public ActitimeEnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	public void clickOnLogout()
	{
		logoutBTN.click();
	}
	
	public void clcikOnHelp()
	{
		help.click();
	}
	
	public void clickOnAbout()
	{
		about.click();
	}
	
	public void verifyTheBuild(String ebuild)
	{
		String aBuild = verifyBuild.getText();
		Assert.assertEquals(aBuild, ebuild);
	}
}
