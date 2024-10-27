package com.PracticeTestAutomation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.PracticeTestAutomation.Pages.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	
	

}
