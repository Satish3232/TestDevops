package com.PracticeTestAutomation.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestCases extends BaseClass{

		@Test(priority=1)
		
		public void verifyUrl() {
			
			String url = lp.getUrl();
			Assert.assertTrue(url.contains("practice-test-login"));
			System.out.println("URL is valid: " + url);
			
		}
		
		@Test(priority=2)

		
		public void verifyTitel() {
			
			String Title = lp.getAppTitle();
			Assert.assertTrue(Title.contains("Test Login"));
			System.out.println("Title is valid: " + Title);
			
		}
		
		@Test(priority=3)
		
		public void positiveLoginTest() {
			
			lp.dologin("Student", "Password123");
			Assert.assertTrue(driver.getCurrentUrl().contains("loggedin-in-successfully"));
			System.out.println("Pass: Login Completed " );
			lp.doLogout();
			
			
		}
		
		@Test(priority=4)
		
		public void negativeUserenameTest() {
			
			lp.dologin("IncorrectUser", "Password123");
			Assert.assertTrue(driver.getCurrentUrl().contains("practice-test-login"));
			System.out.println("Pass: Username is  incorrect" );
			lp.doLogout();
			
			
		}
		
		@Test(priority=5)
		
		public void negativePasswordTest() {
			
			lp.dologin("Student", "Incorrectpassword");
			Assert.assertTrue(driver.getCurrentUrl().contains("practice-test-login"));
			System.out.println("Pass: Password is  incorrect " );
			lp.doLogout();
			
			
		}
}
