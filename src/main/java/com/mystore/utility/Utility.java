package com.mystore.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	static WebDriver driver;
	
	public static void getScreenshot() throws IOException {
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File d=new File("C:/Users/Admin/Workspace/New folder/MyStoreV1/Screenshot/TC "+timeStamp()+ ".png");
		FileUtils.copyDirectory(file, d);
	}
	
	public static String timeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		
	}
	
}
