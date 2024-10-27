package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03ReadURL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		driver.get("https://www.google.com");
		
		String url = driver.getCurrentUrl();
		
		System.out.println("URL:" + url);
		
		

	}

}
