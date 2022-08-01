package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
		
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
		
		
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
		
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
		
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
		
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
		
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
