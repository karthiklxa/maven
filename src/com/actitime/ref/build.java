package com.actitime.ref;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class build {

	static
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}

public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//div[@class='popup_menu_arrow'])[3]")).click();
	
	driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
	
	WebElement v = driver.findElement(By.xpath("//span[.='(build 40469)']"));
	String t = v.getText();
	System.out.println(t);
	
		
	}

}
