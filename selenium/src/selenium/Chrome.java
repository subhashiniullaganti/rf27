package selenium;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Chrome {
 
         public static void main(String [] args) throws InterruptedException{
                  //System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
                  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
                  WebDriver driver = new ChromeDriver();
                  driver.get("https://www.facebook.com/");
                  driver.close();
           }
}