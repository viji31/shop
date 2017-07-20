package common_lib;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.Zip;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import java.io.*;


@Listeners(CustomListener.class)
public class SuperTestScript 
{

	public static WebDriver driver;
	
	
	@BeforeMethod
	public void preCond()
	{
		String path = "./testdata/userdata.xls";
		ExcelLibrary el = new ExcelLibrary(path, "Config", 1);
		String browserType = el.readData(0);
		String url = el.readData(1);
		if (browserType.equals("GC"))
		{
		
			System.setProperty("Webdriver.chrome.driver", "./exefiles/chrome.exe");
			driver = new ChromeDriver();
		}
		
		else if (browserType.equals("IE"))
		{
			System.setProperty("Webdriver.IE.driver", "./exefiles/IEdriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		else
		{
		
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	
	@AfterMethod
	public void postCond()
	{
		driver.close();
		driver.quit();
	}
	
	@AfterSuite
	public void backUp()
	{
		Date d1= new Date();
		String currentDateAndTime = d1.toString().replace(":", "_");
		File src = new File("./test-output");
		File tar = new File("./reports/"+currentDateAndTime+".zip");
		Zip z1 = new Zip();
		
		try
		{
			z1.zip(src,tar);
		}
		catch (Exception e)
		{
			
		}
		
	}
}
