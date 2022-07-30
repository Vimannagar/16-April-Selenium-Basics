package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
		System.out.println("Login to application");
		System.out.println("*********************************");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
		System.out.println("Logout to application");
		System.out.println("*********************************");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
		System.out.println("nav to search page");
		System.out.println("*********************************");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
		System.out.println("Navigate back to home page");
		System.out.println("*********************************");
	}
	
	@Test
	public void searchMobile()
	{
		System.out.println("Search mobile test case");
	}
	
	@Test
	public void searchLaptop()
	{
		System.out.println("Search laptop test case");
	}

}
