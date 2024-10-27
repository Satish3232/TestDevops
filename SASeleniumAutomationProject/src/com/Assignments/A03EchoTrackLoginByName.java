package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03EchoTrackLoginByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.name("txtCustomerID"));
		userName.sendKeys("Satishsahu");
		
		WebElement pass = driver.findElement(By.name("txtPassword"));
		pass.sendKeys("1234567890");
		
		WebElement LogIn = driver.findElement(By.name("Butsub"));
		LogIn.click();
		
		
		WebElement errMsg = driver.findElement(By.id("lblMsg"));
		String text = errMsg.getText();
		System.out.println("Error Message: " + text );
	
	}

}
