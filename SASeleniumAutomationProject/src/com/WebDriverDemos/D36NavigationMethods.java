package com.WebDriverDemos;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D36NavigationMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.partialLinkText("Drop")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();

	}

}
