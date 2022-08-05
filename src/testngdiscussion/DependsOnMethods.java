package testngdiscussion;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	
	@Test(priority = 1)
	public void getTitleOfPage()
	{
		System.out.println("Title of page");
	}
	
	
	@Test(priority = 2)
	public void loginToApp()
	{
		System.out.println("Login to application test case");
		
		throw new NoSuchElementException();
	}
	
	
	@Test(priority = 3, dependsOnMethods = {"loginToApp", "getTitleOfPage"})
	public void navToAdminTab()
	{
		System.out.println("Navigate to Admin");
	}
	
	@Test(priority = 4, dependsOnMethods = "navToAdminTab", alwaysRun = true)
	public void handlingCheckBox()
	{
		System.out.println("CheckBox handling case");
	}
	
	
}
