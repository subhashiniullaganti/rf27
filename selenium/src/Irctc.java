import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Irctc {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
	public static void main(String[] args) {
		
	// open the browser
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
	
	//click on login button
	driver.findElement(By.id("loginbutton")).click();
	//wait till JS pop up is displayed
	WebDriverWait wait= new WebDriverWait(driver,5);
	wait.until(ExpectedConditions.alertIsPresent());
	//click button
	Alert alert=driver.switchTo().alert();
	//get msg &print
	System.out.println(alert.getText());
	alert.accept();
	// alert.dismiss();
	}
	
	
			
	
	

}
