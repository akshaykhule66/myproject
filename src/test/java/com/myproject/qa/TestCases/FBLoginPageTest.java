package com.myproject.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.myproject.qa.Base.BaseClass;
import com.myproject.qa.Pages.FBLoginPage;

public class FBLoginPageTest extends BaseClass {
		

		@BeforeClass
		public void setup() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selenium All Jar\\chromedriver.exe");
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
		public void FacebookLoginPageTest() {
			FBLoginPage lp = new FBLoginPage(driver);
			lp.VerifyFacebookLoginPageLogo();
			lp.VerifyFacebookLoginPageTagline();
			lp.VerifyFacebookLoginPageCreateNewAccountBtn();
			lp.VerifyFacebookLoginPageForgotPasswordLink();
			lp.VerifyFacebookLoginPageFooterlinksSize();
			lp.SetFacebookLoginPageUsername();
			lp.SetFacebookLoginPagePassword();
			lp.ClickFacebookLoginPageLoginBtn();
			
		}
}
