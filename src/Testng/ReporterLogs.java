package Testng;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.Logs;
import org.seleniumhq.jetty9.util.log.LoggerLog;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class ReporterLogs 
{
	private static WebDriver driver;
	private static Logger Log = Logger.getLogger(Logs.class.getName());
	 @Test
	public static void test() {
	DOMConfigurator.configure("log4j.xml");
	System.setProperty("webdriver.chrome.driver", "./Exe/chromedriver.exe");
	driver=new ChromeDriver();
	 Log.info("New driver instantiated");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	 Log.info("Implicit wait applied on the driver for 10 seconds");
	 driver.get("http://s5.mykidsbank.org/");
	 Log.info("Web application launched");
	 
	 // Our first step is complete, so we produce a main event log here for our reports.
	 
	 Reporter.log("Application Lauched successfully | ");
	 
	 driver.findElement(By.name("bank_id")).sendKeys("50092");
	 Log.info("Click action performed on My Account link");
	
	 driver.findElement(By.name("username")).sendKeys("banker");
	 Log.info("Username entered in the Username text box");
	 
	 driver.findElement(By.name("password")).sendKeys("girish010");
	 Log.info("Password entered in the Password text box");
	 
	 driver.findElement(By.id("clicked_when_enter_id")).click();
	 Log.info("Click action performed on Submit button");
	 // Here we are done with our Second main event
	 Reporter.log("Sign In Successful | " );
	 
	 driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/span")).click();
	 Log.info("Click action performed on Log out link");
	 
	 driver.quit();
	 Log.info("Browser closed");
	 // This is the third main event
	 Reporter.log("User is Logged out and Application is closed | ");
	}


}
