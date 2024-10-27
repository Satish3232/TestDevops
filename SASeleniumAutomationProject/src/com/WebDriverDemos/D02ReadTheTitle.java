package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02ReadTheTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		String actTitle = driver.getTitle();
		System.out.println("Title of this page" + actTitle);
		
	
		//String title = driver.getTitle();
		//System.out.println("Title of this page" + title);
		
		if(actTitle.equals(actTitle))
			System.out.println("Opened Google\nTest case pass");
		
		else
			System.out.println("Not Opened Google \nTest case fail");
		
		driver.close();

}
}