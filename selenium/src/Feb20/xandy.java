package Feb20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xandy {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.opensourcebilling.org/");
	WebElement un=driver.findElement(By.id("email"));
	Thread.sleep(1000);
	
	int x=un.getLocation().getX();
	System.out.println(x);
	
	int y=un.getLocation().getY();
	System.out.println(y);
	
	WebElement pw=driver.findElement(By.id("password"));
	int x1=pw.getLocation().getX();
	System.out.println(x1);
	Thread.sleep(1000);
	
	int y1=pw.getLocation().getY();
	System.out.println(y1);
	
	
}
	

}
