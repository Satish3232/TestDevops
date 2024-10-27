package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocatedbyClassName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.className("gLFyf"));
		searchBox.sendKeys("Automation jobs for Fresher");
		searchBox.sendKeys(Keys.ENTER);
		
		String title = driver.getTitle();
		
		if(title.contains("Automation jobs for Fresher"))
			System.out.println("Correct search result Displayed");
			
		else
			System.out.println("Getting wrong result");
				
				
			
	}

}
