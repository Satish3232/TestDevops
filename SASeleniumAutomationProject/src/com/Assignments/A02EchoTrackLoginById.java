package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02EchoTrackLoginById {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.id("txtCustomerID"));
		userName.sendKeys("satishsahu");
		
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		passWord.sendKeys("1234567890");
		
		WebElement logIn = driver.findElement(By.className("btn-primary"));
		logIn.click();
		
		

	}

}
