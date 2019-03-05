package action1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	WebElement linktxt=driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
			Thread.sleep(1000);
	Actions act=new Actions(driver);
	act.contextClick(linktxt).perform();
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_W);
}
}
