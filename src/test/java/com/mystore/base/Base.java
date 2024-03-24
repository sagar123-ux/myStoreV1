package com.mystore.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	WebDriver driver;
	public static WebDriver openChromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}
	
public static WebDriver openEdgeBrowser() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		return driver;
		
	}
}
