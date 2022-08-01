package testngdiscussion;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite");
	}
	
	@Test
	public void buyHeadPhones()
	{
		System.out.println("Head phone buy test");
	}
	
	
	@Test
	public void buyMouse()
	{
		System.out.println("Mouse test case");
	}

}
