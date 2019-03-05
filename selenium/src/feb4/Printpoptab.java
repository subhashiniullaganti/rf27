package feb4;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printpoptab {
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
	
	for(int i=1; i<=3; i++) {
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		
	}
	

	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ESCAPE);
	r.keyRelease(KeyEvent.VK_ESCAPE);
	
}

}
