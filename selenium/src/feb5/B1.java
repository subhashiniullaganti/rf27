package feb5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		A1 a= new A1(driver);
		a.setusername();
		
	}

}
