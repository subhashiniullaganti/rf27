package action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.vtiger.com/");
	WebElement m=driver.findElement(By.xpath("//a[text()='Resources']"));
	Thread.sleep(1000);
	Actions act=new Actions(driver);
	act.moveToElement(m).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Contact']")).click();
	Thread.sleep(1000);
	WebElement hr = driver.findElement(By.xpath("//div[text()='Human Resources']"));
	             String ph = hr.getText();
	             System.out.println(ph);
	
	
}
}
