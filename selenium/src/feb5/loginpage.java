package feb5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	// declaration
	private  WebElement untb;
	private  WebElement pwtb;;
	private  WebElement loginBTN;
	//initilization
	public loginpage(WebDriver driver) {
		untb=driver.findElement(By.id("username"));
		pwtb=driver.findElement(By.name("pwd"));
		loginBTN=driver.findElement(By.xpath("//div[text()='Login ']")) ;
		
	}
	//utilization
	public void setUserName(String un) {
		untb.sendKeys(un);
	}
	public void setpassword(String pwd) {
		pwtb.sendKeys(pwd);
	}
	public void clicklogin() {
		loginBTN.click();
		
	}
	
	
	         

}
