package com.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.cssSelector("span[class*=_ap3a]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement email= driver.findElement(By.name("emailOrPhone"));
		email.sendKeys("satishsahu3232@gmail.com");
		
		WebElement password= driver.findElement(By.name("password"));
		System.out.println("Is username box enabled " + password.isEnabled());
		password.sendKeys("1234567890");
		
		WebElement fullname= driver.findElement(By.name("fullName"));
		System.out.println("Is Fullname box enabled " + fullname.isEnabled());
		fullname.sendKeys("Satish Sahu");
		
		WebElement user= driver.findElement(By.name("username"));
		System.out.println("Is username box enabled " + user.isEnabled());
		user.sendKeys("sahu_bali");
		
		WebElement signup=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Is Signup box enabled " + signup.isEnabled());

	}

}
