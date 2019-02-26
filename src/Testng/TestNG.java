package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG
{
	public WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
	// Create a new instance of the Firefox driver
		System.setProperty("webdriver.chrome.driver", "./Exe/chromedriver.exe");
		driver=new ChromeDriver();
	//Put a Implicit wait, this means that any search for elements on the page could take
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Launch the Online Store Website
	driver.get("http://s5.mykidsbank.org/");
	}
	
	
	@Test
	public void main() 
	{
	
	driver.findElement(By.name("bank_id")).sendKeys("50092");
	
	driver.findElement(By.name("username")).sendKeys("banker");
	
	driver.findElement(By.name("password")).sendKeys("girish010");
	
	driver.findElement(By.id("clicked_when_enter_id")).click();
	
	
	// Print a Log In message to the screen
	System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	
	// Find the element that's ID attribute is 'account_logout' (Log Out)
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/span")).click();
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
	// Close the driver
		driver.quit();
	}
}
	


