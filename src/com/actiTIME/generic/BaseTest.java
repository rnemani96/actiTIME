package com.actiTIME.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.get("https://demo.actitime.com/login.do");	
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	

}
