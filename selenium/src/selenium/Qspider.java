package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspider {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/company/qspiders");
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		
	  int count = allLinks.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			WebElement link = allLinks.get(i);

			String text = link.getText();
			System.out.println(text);

		}

		driver.close();
	}

}
