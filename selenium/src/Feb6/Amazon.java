package Feb6;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon {
	@FindBy(xpath="//img")
	List<WebElement> allimg;
	//inti
	public Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void getimgcount() {
int count=allimg.size();
		System.out.println(count);
	}

}
