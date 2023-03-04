package com.cms.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static String captureScreenshot(WebDriver driver) {
		
		//TakescreenShot Interface
		
		File source= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String screenShotPath = System.getProperty("user.dir")+"/Screenshots/CMS_"+ getCurrentDateTime() + ".png";
		
		//FileHandler Class
		try {
			org.openqa.selenium.io.FileHandler.copy(source, new File(screenShotPath));
			
			System.out.println("<<<<Screenshot Captured>>>>");
		} catch (IOException e) {
			
			System.out.println("Unable to capture screenshot>>> " + e.getMessage());
		}
		
		return screenShotPath;
	}
	
	public static String getCurrentDateTime() {
		
		DateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date currentDate =new Date();
		
		return dateFormat.format(currentDate);
	}

}
