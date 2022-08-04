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
	
	@Parameters({"environment", "buildversion"})
	@Test
	public void buildInfo(String env, String version)
	{
		System.out.println("Env variable value is "+env);
		System.out.println("version variable value is "+version);
	}

}
