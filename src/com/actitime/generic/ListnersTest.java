package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ListnersTest implements ITestListener
{
//	public static WebDriver driver;

	public void onTestStart(ITestResult result)
	{
	}

	public void onTestSuccess(ITestResult result) 
	{
	}

	public void onTestFailure(ITestResult result)
	{

		
		try 
		{
			ITestNGMethod m = result.getMethod();
			String name = m.getMethodName();
			EventFiringWebDriver e = new EventFiringWebDriver(BaseTest.driver);
			File src = e.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/"+name+".png");
			FileUtils.copyFile(src, dest);
		}
		catch (IOException e1)
		{
		}
	}

	public void onTestSkipped(ITestResult result)
	{
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
	}

	public void onStart(ITestContext context)
	{
	}

	public void onFinish(ITestContext context) 
	{
	}

}
