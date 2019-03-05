package Feb6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkstest {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost/login.do");
		Links li=new Links(driver);
		li.getlinkcount();
		driver.close();
	}
}
