package com.actiTIME.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTIME.generic.BasePage;

public class LoginPage extends BasePage{

	//declaration
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
		
	}
	
	public void enterPassWord(String pass)
	{
		pwTB.sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	
	public void verifypage(String eTitle)
	{
		verifyTitle(eTitle);
	}
	public void verifyVersion()
	{
		verifyElement(version);
	}

}
