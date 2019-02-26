package Data_Driven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class login_ts 
{
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")
	WebElement id;
	
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")
	WebElement email;
	
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")
	WebElement pwd;
	
	@FindBy(xpath="//*[@id='clicked_when_enter_id']")
	WebElement log;
	
	public login_ts(WebDriver d)

	{
		PageFactory.initElements(d, this);
	}
	public void test(WebDriver d) throws IOException, InterruptedException
	{
		DataDriven a=new DataDriven();
		
		String id1=a.getdata("Sheet1", 0, 0);
		String email1=a.getdata("Sheet1", 0, 1);
		String pwd1=a.getdata("Sheet1", 0, 2);
		
		id.sendKeys(id1);
		email.sendKeys(email1);
		Thread.sleep(2000);
		
		pwd.sendKeys(pwd1);
		
		Thread.sleep(2000);
		log.click();
		
		
	}

}

