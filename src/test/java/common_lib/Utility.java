package common_lib;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.io.*;

public class Utility 
{

	public void takeScreenshot(String methodName)
	{
		EventFiringWebDriver ef = new EventFiringWebDriver(SuperTestScript.driver);
		
		File src = ef.getScreenshotAs(OutputType.FILE);
		File tar = new File("./screenshot/"+methodName+".png");
		
		try
		{
			FileUtils.moveFile(src, tar);
		}
		catch (Exception e) 
		{
			
		}
	}
	
	
}
