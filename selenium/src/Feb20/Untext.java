package Feb20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Untext {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.opensourcebilling.org/");
	WebElement un=driver.findElement(By.id("email"));
	un.clear();
//	Thread.sleep(1000);
  //   int height=un.getSize().getHeight();
//	System.out.println(height);
	
	//int width=un.getSize().getWidth();
	//System.out.println(width);
	
}
}
