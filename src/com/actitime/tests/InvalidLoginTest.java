package com.actitime.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelDataGeneric;
import com.actitime.page.LoginPage;

@Listeners(com.actitime.generic.ListnersTest.class)
public class InvalidLoginTest extends BaseTest
{
	@Test
	public void testInvalidLogin()
	{
		String loginTitle = ExcelDataGeneric.getData(file_path, "Login", 1, 2);
		String user = ExcelDataGeneric.getData(file_path, "Login", 2, 0);
		String pwd = ExcelDataGeneric.getData(file_path, "Login", 2, 1);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.verifyTheTitle(loginTitle);
		
		lp.enterUN(user);
		
		lp.enterPWD(pwd);
		
		lp.clickOnLogin();
		
		lp.verifyErrorMsg();

		

	}

}
