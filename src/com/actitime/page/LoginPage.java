package com.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage
{
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwdTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMSG;
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME ')]")
	private WebElement version;
	
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUN(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPWD(String pwd)
	{
		pwdTB.sendKeys(pwd);
	}
	
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	
	public void verifyTheTitle(String etitle)
	{
		verifyTitle(etitle);
	}
	
	public void verifyErrorMsg()
	{
		verifyElement(errMSG);
	}
	
	public void verifyTheVersion(String eversion)
	{
		String aversion = version.getText();
		Assert.assertEquals(aversion, eversion);
	}

}
