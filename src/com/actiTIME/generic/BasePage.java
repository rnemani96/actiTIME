package com.actiTIME.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		try
		{
			wait.until(ExpectedConditions.titleIs("eTitle"));
			Reporter.log("Title is matching",true); 
		
		}
		
		catch(Exception e)
		{
			Reporter.log("Title is not matching", true);
			Assert.fail();
			
		}
		}
		
	public void verifyElement(WebElement element)	
	{
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element found",true); 
		
		}
		
		catch(Exception e)
		{
			Reporter.log("Element not found", true);
			Assert.fail();
			
			
		}
	}
	}



