package Feb6;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Links {
	@FindBy(xpath="//a")
	List<WebElement>alllinks;
	//in
	public Links(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void getlinkcount() {
		int count=alllinks.size();
		System.out.println(count);
	}

}
