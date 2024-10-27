package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnSpecificLink {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://marvel.com/");
		
		String title = driver.getTitle();
		System.out.println("Title of this page : " + title);
		
		driver.navigate().to("https://www.marvel.com/movies");
		System.out.println("Title of this page 2 : " + title);
		
		driver.findElement(By.xpath("//*[@id=\"mvl-flyout-button-3\"]")).click();
			
		
	}

}
