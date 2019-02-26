package Screenshoot;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshoot {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "./Exe/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Pass the url
		driver.get("http://www.google.com");

		TakesScreenshot ts=(TakesScreenshot)driver;
		
		// Take screenshot and store as a file format
		File src= ts.getScreenshotAs(OutputType.FILE);
	
		//now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("./Screenshot_Images/screeshot1.bmp"));
	 

	}

}
