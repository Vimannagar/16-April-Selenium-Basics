package testngdiscussion;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class InclusionAndExclusionOfMethods {
	
	
	@Test(priority = 1)
	public void getTitleOfPage()
	{
		System.out.println("Title of page");
	}
	
	
	@Test
	public void loginToApp()
	{
		System.out.println("Login to application test case");
		
		
	}
	
	
	@Test(priority = 3)
	public void navToAdminTab()
	{
		System.out.println("Navigate to Admin");
	}
	
	@Test
	public void handlingCheckBox()
	{
		System.out.println("CheckBox handling case");
	}

}
