package feb4;


	
package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartrip {                                                                                                
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
				driver.get("https://www.cleartrip.com");
		driver.switchTo().activeElement().sendKeys("Ban");
		Thread.sleep(2000);
		String xp="//span[contains((text),Ban])";
		List<WebElement> allASE=driver.findElements(By.xpath(xp));
		int count=allASE.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement ase=allASE.get(i);
			String text=ase.getText();
			System.out.println(text);
			
		}
		allASE.get(0).click();
		
	}	
	
		
	}

