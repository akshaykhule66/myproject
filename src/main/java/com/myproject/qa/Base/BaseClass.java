package com.myproject.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium All Jar\\chromedriver.exe");
		    driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Desktop\\Selenium All Jar\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}else {
			System.out.println("Wrong Browser Name Selected.");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
}
