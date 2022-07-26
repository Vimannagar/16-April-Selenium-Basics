package testngdiscussion;

import org.testng.annotations.Test;

public class EnabledKeyword {
	

	@Test(enabled = false)
	public void getAppUrl()
	{
		System.out.println("current url test case");
	}
	
	
	@Test
	public void loginToApp()
	{
		System.out.println("Login Test case");
	}

}
