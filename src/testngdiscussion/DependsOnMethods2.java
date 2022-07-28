package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethods2 {

	
	@Test(priority = 1, dependsOnMethods = "testngdiscussion.DependsOnMethods.handlingCheckBox")
	public void editProfile()
	{
		System.out.println("Edit profile test case");
	}
	
	
	@Test(priority = 2)
	public void viewProfile()
	{
		System.out.println("view profile test case");
		
		
	}
}
