package com.PracticeTestAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	//Locators
	private By user=By.id("username");
	private By pwd=By.name("password");
	private By submitBtn= By.xpath("//button[text()='Submit']");
	private By logoutBtn= By.xpath("//a[text()='Log out']");
	
	//Methods
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	public String getAppTitle() {
		return driver.getTitle();
	} 
	public void dologin(String username, String password) {
		driver.findElement(user).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(submitBtn).click();
	}
	public void doLogout() {
		driver.findElement(logoutBtn).click();
	}
}
