package com.Entrata;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D03ThirdTestCase {
  @Test
  public void Incorrectusername() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://sso.entrata.com/entrata/login");
	  driver.findElement(By.id("entrata-username")).sendKeys("Satishsahu3232");
	  driver.findElement(By.id("entrata-password")).sendKeys("1234567890");
	  
	  driver.close();
  }
}
