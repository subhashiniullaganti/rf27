package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testmtr {
	
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/seshaiah/Desktop/hotel.html");
		WebElement slvlb =driver.findElement(By.id("slv"));
		Select slv= new Select(slvlb);
		WebElement option=slv.getFirstSelectedOption();
		String text= option.getText();
		System.out.println(text);
		
		
		List<WebElement> alloptions= slv.getOptions();
		System.out.println(alloptions.size());
		for(WebElement v: alloptions)
		{
			String t =v.getText();
			System.out.println(t);
		}
	
		
		
		
		
			   WebElement w= slv.getWrappedElement();

		System.out.println(w.getText());
		driver.close();
		
	}
		
	
	
	
	
	
		
		
		
		
}
