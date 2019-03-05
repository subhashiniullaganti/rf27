package feb15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demoA {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
@Test
public void test() {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	String actual=driver.getTitle();//actual value from application
	String expected ="boogle";//expected value should be take from excel file
	Assert.assertEquals(actual, expected);
}

}
