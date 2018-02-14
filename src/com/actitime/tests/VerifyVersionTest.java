package com.actitime.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelDataGeneric;
import com.actitime.page.LoginPage;
 
@Listeners(com.actitime.generic.ListnersTest.class)
public class VerifyVersionTest extends BaseTest
{
	@Test
	public void testVerifyVersion()
	{
		String loginTitle = ExcelDataGeneric.getData(file_path, "Login", 1, 2);
		String version = ExcelDataGeneric.getData(file_path, "Login", 1, 3);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.verifyTheTitle(loginTitle);
		
		lp.verifyTheVersion(version);

	}

}
