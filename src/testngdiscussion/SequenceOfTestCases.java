package testngdiscussion;

import org.testng.annotations.Test;

public class SequenceOfTestCases {
	
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login to the application");
	}
	
	
	@Test(priority = -2000)
	public void home()
	{
		System.out.println("Home page of application");
	}
	
	@Test(priority = 4)
	public void dashBoard()
	{
		System.out.println("Dashboard of application");
	}
	
	@Test
	public void logout()
	{
		System.out.println("Logout from the application");
	}
	

	@Test(priority = 300)
	public void profile()
	{
		System.out.println("Profile of an application");
	}
	

}
