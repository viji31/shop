package common_lib;

import org.testng.Assert;

public class validationLib 
{

	public String verifyRes(String actRes, String expRes)
	{
	
		try
		{
			Assert.assertEquals(actRes, expRes);
			return "pass";
		}
		
		catch (Exception e) 
		{
			return "fail";
		}
	}
}
