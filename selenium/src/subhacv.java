import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class subhacv {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
	
}
public static void main(String[] args) {
	File f = new File("./cv/subha1 2yrs selenium.docx");
	String  absolutepath=f.getAbsolutePath();
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/seshaiah/Desktop/noukri.html");
	WebElement browseButton=driver.findElement(By.id("cv"));
	
	browseButton.sendKeys(absolutepath);
	
	
	
}
}
