import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.get("http://desktop-p44tvgi/login.do");
		driver.findElement(By.id(" username")).sendKeys(" admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath(" //div[text()='login']")).click();
		while(true) {
			try {
				driver.findElement(By.id("logoutlink)")).click();
				System.out.println(" logout link is found & clicked");
				break;
			}
			catch(Exception e) {
				System.out.println(" logout link is not found ,will try again");
			}
		}

System.out.println("end");
	}
}
