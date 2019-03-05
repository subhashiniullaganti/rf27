import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(" http://www.flipkart.com/");
		String xp="(//input[@type='text'])[2]";
		driver.findElement(By.xpath(xp)).sendKeys("subha");
		String xp2=" //button[not(@type)]";
		driver.findElement(By.xpath(xp2)).click();
		}

}
	
