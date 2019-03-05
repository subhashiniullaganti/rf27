package Feb6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amatest {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get(" https://www.amazon.com/");
	Amazon a=new Amazon(driver);
	a.getimgcount();
	driver.close();
}
}
