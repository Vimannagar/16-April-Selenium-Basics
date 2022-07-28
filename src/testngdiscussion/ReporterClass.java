package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass {
	
	@Test
	public void loginTest()
	{
		Reporter.log("Login to application", true);
	}
	
	

	@Test
	public void dashboard()
	{
		Reporter.log("dashboard test case", false);
	}

}
