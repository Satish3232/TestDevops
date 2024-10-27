package com.Entrata;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01FirstTestCase {
  @Test
  public void openSSOEntrata () {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://sso.entrata.com/entrata/login");
	  
	  System.out.println("Title"  + driver.getTitle());
	  
	  driver.close();
  }
  
}
