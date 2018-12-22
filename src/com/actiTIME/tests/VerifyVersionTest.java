package com.actiTIME.tests;

import org.testng.annotations.Test;

import com.actiTIME.generic.BaseTest;
import com.actiTIME.generic.ExcelData;
import com.actiTIME.pages.LoginPage;

public class VerifyVersionTest extends BaseTest{
	public String loginTitle;
	@Test
	public void  VerifyVersionTest()
	{
		ExcelData.getdata("./data/input.xlsx", "Sheet1", 1, 2);
		 
		LoginPage lp =new LoginPage(driver);
		
		
		lp.verifypage(loginTitle);
		lp.verifyVersion();
		
		
	}

}
