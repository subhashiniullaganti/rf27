package feb21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enlable {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/seshaiah/Desktop/subha4.html");
	WebElement pw=driver.findElement(By.id("t2"));
	if(pw.isEnabled()) {
		System.out.println("pwd textbox is enabled");
	}
	else
	{
		System.out.println("pwd textbox is disabled");
	}
	
	
	
}
}
