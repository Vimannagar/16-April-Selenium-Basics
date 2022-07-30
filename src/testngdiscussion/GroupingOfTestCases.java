package testngdiscussion;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupingOfTestCases {
	
	@BeforeGroups("Functional")
	public void beforeGroups()
	{
		System.out.println("Executing the before group for Functional");
	}
	
	@AfterGroups("Regression")
	public void afterGroups()
	{
		System.out.println("Executing the after group for Regression");
	}
	
	
	@Test(groups = {"Regression", "Sanity"})
	public void getTitleOfPage()
	{
		System.out.println("Title of page");
	}
	
	
	@Test(groups = {"Sanity", "Functional"})
	public void loginToApp()
	{
		System.out.println("Login to application test case");
	}
	
	
	@Test(groups = "Regression")
	public void navToAdminTab()
	{
		System.out.println("Navigate to Admin");
	}
	
	@Test(groups = {"Sanity", "Regression"})
	public void handlingCheckBox()
	{
		System.out.println("CheckBox handling case");
	}
	
	@Test(groups = {"Functional", "Regression"})
	public void testcase2()
	{
		System.out.println("test case 2");
	}

}
