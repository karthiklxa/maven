package com.actitime.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelDataGeneric;
import com.actitime.page.ActitimeEnterTimeTrackPage;
import com.actitime.page.LoginPage;

@Listeners(com.actitime.generic.ListnersTest.class)
public class VerifyBuildTest extends BaseTest
{
	@Test
	public void testVerifyBuild()
	{
		String loginTitle = ExcelDataGeneric.getData(file_path, "Login", 1, 2);
		String user = ExcelDataGeneric.getData(file_path, "Login", 1, 0);
		String pwd = ExcelDataGeneric.getData(file_path, "Login", 1, 1);
		String EnterTimeTrackTitle = ExcelDataGeneric.getData(file_path, "Enter Time-Track", 1, 0);
		String build = ExcelDataGeneric.getData(file_path, "Enter Time-Track", 1, 1);
		
		LoginPage lp = new LoginPage(driver);
		ActitimeEnterTimeTrackPage ep = new ActitimeEnterTimeTrackPage(driver);
		
		lp.verifyTheTitle(loginTitle);
		
		lp.enterUN(user);
		
		lp.enterPWD(pwd);
		
		lp.clickOnLogin();
		
		lp.verifyTheTitle(EnterTimeTrackTitle);
		
		ep.clcikOnHelp();
		
		ep.clickOnAbout();
		
		ep.verifyTheBuild(build);
		
	}

}
