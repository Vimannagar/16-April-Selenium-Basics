package testngdiscussion;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationInTestNG {
	
	
	@Parameters("browser")
	@Test
	public void launchBrowser(String readvalue)
	{
		System.out.println("Browser name is "+readvalue);
	}

}
