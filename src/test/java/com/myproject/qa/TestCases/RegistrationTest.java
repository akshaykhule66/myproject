package com.myproject.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.myproject.qa.Base.BaseClass;
import com.myproject.qa.Pages.RegistrationPage;

public class RegistrationTest extends BaseClass{
		// methods call. // Testcases.
		
		// Browser setup ==> validations apply ==> browser close.
		 
		@BeforeClass
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium All Jar\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@AfterClass
		public void teardown() {
			//driver.close();
		}
		
		
		@Test
		public void FacebookRegistrationPageTest_Positive() {
			
			RegistrationPage rp = new RegistrationPage(driver);
			rp.ClickFacebookSignupLink();
			rp.VerifyFacebookRegistrationPageFblogo();
			rp.VerifyFacebookRegistrationPageAlreadyAccount();
			rp.SetFacebookRegistrationPageLastname();
			rp.SetFacebookRegistrationPageFirstname("ABC");
			rp.SetFacebookRegistrationPageMobileEmail();
			rp.SetFacebookRegistrationRePageMobileEmail();
			rp.SetFacebookRegistrationPagePassword();
			rp.SetFacebookRegistrationPageBirthDay();
			rp.SetFacebookRegistrationPageBirthMonth();
			rp.SetFacebookRegistrationPageBirthYear();
			rp.SetFacebookRegistrationPageGender("male");
			rp.ClickFacebookRegistrationPageSubmitBtn();
		}
}
