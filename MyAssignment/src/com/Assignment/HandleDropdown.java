package com.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement ele = driver.findElement(By.name("url"));
		
		Select dd = new Select(ele);
		System.out.println("is Dropdown Supports multipler selections : " + dd.isMultiple());
		
		dd.selectByIndex(3);
		Thread.sleep(2000);	
		dd.selectByValue("search-alias=electronics");
	}

}
