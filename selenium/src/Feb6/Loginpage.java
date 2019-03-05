package Feb6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage{
	
	//declaration
	@FindBy(id="username")
	private WebElement untb;
	
	final String p="pwd";
	@FindBy(name=p)
	private WebElement pwtb;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginbtn;

	
	//inlization
	public void loginpage1(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}
	
//utilization
	public void setuserName(String un) {
		untb.sendKeys(un);		
	}
	public void setpassword(String pwd) {
		pwtb.sendKeys(pwd);
	}
	public void clicklogin() {
		loginbtn.click();
	}
}
