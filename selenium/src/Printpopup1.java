import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printpopup1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_G);
	r.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ESCAPE);
	r.keyRelease(KeyEvent.VK_ESCAPE);
	
}

}
