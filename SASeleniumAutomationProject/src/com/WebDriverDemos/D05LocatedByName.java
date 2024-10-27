package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocatedByName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement emailId = driver.findElement(By.name("email"));
		emailId.sendKeys("satishsahu3232@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("283829382");
	
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

}
