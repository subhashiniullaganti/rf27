import java.awt.AWTException;
import java.awt.Robot;

public class Mouse3 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe" );
		
	}
public static void main(String[] args) throws AWTException, Exception {
	Robot r =new Robot();
	for(int i=1; i<=200; i++)
	{ 
		r.mouseMove(i, 100);
		Thread.sleep(500);
	}
}
}
