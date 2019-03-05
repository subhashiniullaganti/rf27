package feb14;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollby {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
	
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/license.jsp;jsessionid=3hjkmilcjrfqe");
	JavascriptExecutor js=(JavascriptExecutor ) driver;
	for(int i=0;i<=4;i++) {
	js.executeScript("window.scrollBy(0,500)");
	
}

}
}