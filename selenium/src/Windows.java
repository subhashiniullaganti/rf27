import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get(" https://www.naukri.com/");
		 Set<String> allwhs= driver.getWindowHandles();
		 int count =allwhs.size();
		 System.out.println("count");
		 for(String wh:allwhs)
		 {
			 driver.switchTo().window(wh);
			 System.out.println(driver.getTitle());
			Thread.sleep(1000);
			driver.close();
			 
		 }
	}
}
