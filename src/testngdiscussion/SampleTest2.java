package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SampleTest2 extends SampleTest1{
	
	
	@Test(priority = 3)
	public void enterDetails()
	{
		driver.findElement(By.xpath("//*[contains(@id,'u_0_b_')]")).sendKeys("Velocity");
	}
	
	@Test(priority = 4)
	public void selectBirthdate()
	{
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select selday = new Select(day);
		
		
		selday.selectByVisibleText("15");
		
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		
		Select selmonth = new Select(month);
		
		selmonth.selectByValue("12");
		
		
		
		 WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		 
		 Select selyear = new Select(year);
		 
		 selyear.selectByIndex(9);
		 
	}

	
	

}
