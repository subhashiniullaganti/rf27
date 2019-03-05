import java.awt.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowlicense {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	String parent= driver.getWindowHandle();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost/login.do ");
	driver.findElement(By.id("licenseLInk")).click();
	Set<String> allwhs=driver.getWindowHandles();
	for( String wh:allwhs)
	{
		driver.switchTo().window(wh);
		
	}
	 java.util.List<WebElement> allh = driver.findElements(By.xpath("//h2"));
	 int count =allh.size();
	 System.out.println("count");
	 for(WebElement h:allh)
	 {
		 System.out.println(h.getText());
	 }
	 driver.close();
	 
	 driver.switchTo().window(parent);
	 driver.close();
		 
		 
		 
		 
	 }
	
	
	
}


