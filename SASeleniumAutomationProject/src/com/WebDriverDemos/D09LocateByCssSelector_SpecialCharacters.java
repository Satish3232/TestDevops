package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocateByCssSelector_SpecialCharacters {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		// * - Contains	
		WebElement emailId = driver.findElement(By.cssSelector("input[placeholder*=address]"));
		emailId.sendKeys("Satishsahu3232@gmail.com");
		
		WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"][aria-label=\"Password\"]"));// Mentoring Sesssion
		password.sendKeys("1234567890");
		
		// ^ - Starts with
		WebElement loginBtn = driver.findElement (By.cssSelector("button[id^=\"u_0_5_\"]"));
		loginBtn.click();
		
	}

}
