package Feb6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.log.Log;

import feb5.loginpage;

public class Tas {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://localhost/login.do");	
	      
		Loginpage l =new  Loginpage(driver);
	l.setuserName("admin");
	l.setpassword("manager");
	l.clicklogin();
	driver.close();
	
	
}
}
