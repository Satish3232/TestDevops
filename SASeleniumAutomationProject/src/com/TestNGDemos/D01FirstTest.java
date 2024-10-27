package com.TestNGDemos;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01FirstTest {
  @Test
  public void f() {
	  System.out.println("This is my first TC");
	  
  }
  public void openGoogle()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.google.com");
	  
	  System.out.println("Title"  + driver.getTitle());
  }
}
