package feb5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A1 {
	private WebElement untb;
	
	public A1(WebDriver driver) {
		untb =driver.findElement(By.id("username"));
		
	}
	public void setusername() {
		untb.sendKeys("admin");
	}
	

}
