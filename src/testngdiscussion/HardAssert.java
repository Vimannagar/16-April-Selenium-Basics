package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void testCase1()
	{
		String expected = "Abc";
		
		String actual = "abc";
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("After the assertion");
		
		
	}
	
	@Test
	public void validateTitle()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement createaccount = driver.findElement(By.xpath("//*[contains(@id,'u_0_0_')]"));
		
		
		boolean isdisplay = createaccount.isDisplayed();
		
		
		Assert.assertTrue(isdisplay,"Test case failed please file the bug");
		
		Assert.assertFalse(isdisplay, "Assert false is failed please raise the bug");
		
		
	}
	

}
