package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCases {
	
	@Test(groups = "Regression")
	public void getTitleOfPage()
	{
		System.out.println("Title of page");
	}
	
	
	@Test(groups = "Sanity")
	public void loginToApp()
	{
		System.out.println("Login to application test case");
	}
	
	
	@Test(groups = "Regression")
	public void navToAdminTab()
	{
		System.out.println("Navigate to Admin");
	}
	
	@Test(groups = "Sanity")
	public void handlingCheckBox()
	{
		System.out.println("CheckBox handling case");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("test case 2");
	}

}
