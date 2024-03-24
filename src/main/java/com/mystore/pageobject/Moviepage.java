package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Moviepage {
	
	@FindBy(xpath="//*[@id=\"navbar1\"]/ul/li[3]/a")
	private WebElement mclk;

	
	public Moviepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMovie() {
		mclk.click();
	}

}
