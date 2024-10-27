package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04FacebookGetAlertMessage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement emailId = driver.findElement(By.className("inputtext"));
		emailId.sendKeys("satishsahu3232@gmail.com");
		
		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys("123728339238");
		
		WebElement LogInBtn = driver.findElement(By.cssSelector(""));
		LogInBtn.click();

		}

}
