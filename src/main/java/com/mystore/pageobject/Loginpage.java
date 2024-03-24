package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(id="login_email")
	private WebElement emailId;
	
	@FindBy(id="login_password")
	private WebElement emailPass;
	
	@FindBy(id="submit-btn")
	private WebElement emailBtn;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnUserNameTab() {
		emailId.sendKeys("sagar17cs08@gmail.com");
	}
	
	public void clickOnPasswordTab() {
		emailPass.sendKeys("Sagars@1234");
	}
	
	public void clickSubmitButtonTab() {
		emailBtn.click();
	}
}
