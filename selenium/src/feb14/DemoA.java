package feb14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoA {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/seshaiah/Desktop/subha4.html");
	driver.findElement(By.id("t1")).sendKeys("subha");
     Thread.sleep(1000);
	//driver.findElement(By.id("t2")).sendKeys("shiva");
	JavascriptExecutor js=(JavascriptExecutor ) driver;
	Thread.sleep(2000);
	js.executeScript("document.getElementById(' t2').value='subha'");
}
}
