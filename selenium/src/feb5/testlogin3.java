package feb5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testlogin3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://localhost/login.do");
	loginpage l=new loginpage(driver);
	
	l.setUserName("admin");
	l.setpassword("manager");
	l.clicklogin();
	
	
	l.setUserName("admin");
	l.setpassword("manager");
	l.clicklogin();
	
}
}



