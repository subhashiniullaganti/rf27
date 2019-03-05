package feb5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textlogin2 {

		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
			
		}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost/login.do");
		loginpage l=new loginpage(driver);
		
		l.setUserName("abcd");
		l.setpassword("xyz");
		l.clicklogin();
		
		
	}
	}



