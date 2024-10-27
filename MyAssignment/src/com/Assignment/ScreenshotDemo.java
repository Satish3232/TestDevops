package com.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenshotDemo {

	public void capture() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		//Location
		File dest = new File ("./"+" \\Screenshots\\Google.png");		
		FileHandler.copy(temp, dest);
	}	
	
}
