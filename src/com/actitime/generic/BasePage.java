package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void verifyTitle(String etitle)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("title is matching"+ etitle ,true);
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching",true);
			String l = driver.getTitle();
			System.out.println(l);
			Assert.fail();
		}
		}
	
	public void verifyElement(WebElement element)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is matching"+ element ,true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not matching",true);
			Assert.fail();
		}
	}
}
