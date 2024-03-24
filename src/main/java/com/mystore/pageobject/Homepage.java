package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath="//*[@id=\"navbar1\"]/ul/li[1]/a")
	private WebElement rHome;
	

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHomepage() {
		rHome.click();
	}
	
}
