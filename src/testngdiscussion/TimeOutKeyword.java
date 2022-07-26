package testngdiscussion;

import org.testng.annotations.Test;

public class TimeOutKeyword {
	
	@Test(timeOut = 5000)
	public void loginPerformance() throws InterruptedException
	{
		System.out.println("login test");
		Thread.sleep(6000);
	}

}
