package com.mystore.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.Base;
import com.mystore.pageobject.Homepage;
import com.mystore.pageobject.Loginpage;
import com.mystore.pageobject.Moviepage;
import com.mystore.utility.Utility;

import junit.framework.Assert;

public class MainTest extends Base{
	
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		
		driver=Base.openChromeBrowser();
		driver.get("https://actionott.com/user/login");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void verifyLoginPage() {
		Loginpage login=new Loginpage(driver);
		login.clickOnUserNameTab();
		login.clickOnPasswordTab();
		login.clickSubmitButtonTab();
	}
	
	@Test
	public void verifyHomepage() {
		Homepage house=new Homepage(driver);
		house.clickOnHomepage();
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://actionott.com1/");
	}
	
	@AfterMethod
	public void verifyMovie() throws IOException {
		Moviepage exit=new Moviepage(driver);
		exit.clickOnMovie();
		//Utility.getScreenshot();
	}

	@AfterClass
	public void closeTheBrowser() {
		
		driver.close();
	}
}
