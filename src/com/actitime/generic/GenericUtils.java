package com.actitime.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	public static void selectByIndex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public static void selectByValue(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public static void selectBYVisibleText(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	
	
	
	

}
