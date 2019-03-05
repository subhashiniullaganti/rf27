import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RenewHealth {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) {
	// open the browser
	WebDriver driver=new ChromeDriver();
	//set ITO
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//enter the URL
	driver.get("https://www.religarehealthinsurance.com/rhicl/login");
	//enter the policy number
	driver.findElement(By.id("policynumber")).sendKeys("p437");
	//click DOB
	driver.findElement(By.id("dob")).click();
		//date
	driver.findElement(By.linkText("2"));
	//enter contact number
	driver.findElement(By.id("alternative number")).sendKeys(" 9844631936");
	//click lets renew button
	driver.findElement(By.id("renew_policy_submit"));
	
	

	
}
}
