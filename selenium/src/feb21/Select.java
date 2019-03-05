package feb21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	WebElement chkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	chkbox.click();
	if(chkbox.isSelected()) {
		System.out.println("true");
		
	}
	else
	{
		System.out.println("false");
		
	}
	
}
}
