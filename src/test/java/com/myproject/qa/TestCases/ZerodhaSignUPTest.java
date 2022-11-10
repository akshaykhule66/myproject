package com.myproject.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.myproject.qa.Base.BaseClass;
import com.myproject.qa.Pages.ZerodhaSignUppage;

public class ZerodhaSignUPTest extends BaseClass{

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium All Jar\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://signup.zerodha.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void teardown() {
		//driver.close();
	}
	
	@Test
	public void ZerodhaSignUpPage_PositiveTest() {
		
		ZerodhaSignUppage zd =new ZerodhaSignUppage(driver);
		zd.VerifyImg();
		zd.VerifyZerodhaSignUpPageLogo();
		zd.VerifySignUpNow();
		zd.VerifyWantToOpenAnNRI_Account();
		zd.SetMobileNumber("9049774052");
		zd.ClickContinueBtn();
	}

}
