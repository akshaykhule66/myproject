package com.myproject.qa.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ZerodhaSignUppage {
	
	
	@FindBy(xpath="//img[@src='/img/logo.cec94760.svg']") private WebElement logo;
	@FindBy(xpath="//h1[text()=' Signup now ']") private WebElement signupnow;
	@FindBy(xpath="//a[text()='Want to open an NRI account?']") private WebElement wanttoopenan_nri_account;
	@FindBy(xpath="//img[@src='/img/landing.1b95a104.png']") private WebElement img;
	@FindBy(xpath="//input[@type='text']") private WebElement mobilenumber;
	@FindBy(xpath="//button[@type='submit']") private WebElement continuebtn;
	
	public ZerodhaSignUppage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyZerodhaSignUpPageLogo() {
		Assert.assertTrue(logo.isDisplayed(),"Zerodha logo on signup page is not displayed.");
		Reporter.log("VerifyZerodhaSignUpPageLogo");
	}
	
	public void VerifySignUpNow() {
		Assert.assertTrue(signupnow.isDisplayed(), "signup text on signup page is not displayed.");
		Assert.assertEquals(signupnow.getText(), "Signup now");
		Reporter.log("VerifySignUpNow");
	}
	
	public void VerifyWantToOpenAnNRI_Account() {
		Assert.assertEquals(wanttoopenan_nri_account.getText(), "Want to open an NRI account?");
		Reporter.log("VerifyWantToOpenAnNRI_Account");
	}
	
	public void VerifyImg() {
		Assert.assertTrue(img.isDisplayed(), "img on signup page is not displayed.");
		Reporter.log("VerifyImg");
	}
	
	public void SetMobileNumber(String mn) {
		Assert.assertTrue(mobilenumber.isEnabled(), "mobile no field is not enabled.");
		mobilenumber.sendKeys(mn);
		Reporter.log("SetMobileNumber");
	}
	
	public void ClickContinueBtn() {
		Assert.assertTrue(continuebtn.isEnabled(), "Continue Button is not Enabled.");
		continuebtn.click();
		Reporter.log("ClickContinueBtn");
	}
}
