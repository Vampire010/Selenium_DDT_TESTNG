package Data_Driven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login
{
	WebDriver d;
	@Test
	public void test2() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Exe/chromedriver.exe");
		d=new ChromeDriver();
		
		d.get("http://www.mykidsbank.org/");
		Thread.sleep(2000);
		
		login_ts k=new login_ts(d);
		k.test(d);
	}


}
