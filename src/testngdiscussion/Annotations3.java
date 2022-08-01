package testngdiscussion;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class Annotations3 {
		
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("Before Test for health care");
		}
		
		@Test
		public void buyHealthAidKit()
		{
			System.out.println("Buy Health Aid kit test case");
		}
	
	}
