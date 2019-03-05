package Feb20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printlink {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.opensourcebilling.org/");
	WebElement linktxt=driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
	String text = linktxt.getText();
	System.out.println(text);
	Thread.sleep(1000);
	linktxt.click();
	
	
}
}
