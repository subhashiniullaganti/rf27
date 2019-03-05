import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoA {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	WebElement e=driver.switchTo().activeElement();
	e.sendKeys("java");
	
	
}
}
