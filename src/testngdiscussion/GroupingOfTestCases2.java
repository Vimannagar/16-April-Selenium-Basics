package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCases2 {
	
	@Test(groups = "Sanity")
	public void viewProfile()
	{
		System.out.println("View profile test case");
	}
	
	
	@Test(groups = {"Sanity", "Functional"})
	public void logout()
	{
		System.out.println("logout from application");
	}
	
	
	
}
