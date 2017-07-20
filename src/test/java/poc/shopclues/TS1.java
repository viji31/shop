package poc.shopclues;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TS1 
{

	public static void main(String[] args) 
	{
		
		//System.setProperty("Webdriver.chrome.driver", "C:/Users/TYSS/Downloads/chromedriver_win32");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.shopclues.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		/*String signInPanel = driver.findElement(By.xpath("//div[@id = 'signinPanel']//h3")).getText();
		System.out.println(signInPanel);*/
	
	}

}
