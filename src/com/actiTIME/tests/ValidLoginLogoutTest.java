package com.actiTIME.tests;

import org.testng.annotations.Test;

import com.actiTIME.generic.BaseTest;
import com.actiTIME.generic.ExcelData;
import com.actiTIME.pages.EnterTimeTrackPage;
import com.actiTIME.pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest  {

	@Test
	public void ValidLoginLogoutTest()
	{
	String user = ExcelData.getdata("G:\\cigniti\\actiTIME\\data\\input.xlsx", "Sheet1", 1, 0);
	String pass = ExcelData.getdata("G:\\cigniti\\actiTIME\\data\\input.xlsx", "Sheet1", 1, 1);
	String loginTitle = ExcelData.getdata("G:\\cigniti\\actiTIME\\data\\input.xlsx", "Sheet1", 1, 2);
	String enterTimeTrack = ExcelData.getdata("G:\\cigniti\\actiTIME\\data\\input.xlsx", "Sheet1", 1, 3);
	
		LoginPage lp=new LoginPage(driver);
		EnterTimeTrackPage ep= new EnterTimeTrackPage(driver);
		
		lp.verifypage(loginTitle);
		lp.enterUserName(user);
		lp.enterPassWord(pass);
		lp.clickOnLogin();
		lp.verifypage(enterTimeTrack);
		ep.clickOnLogout();
		lp.verifypage(loginTitle);
		
		
		
		
		
		
		
	}
	
		
		
	

	

}
