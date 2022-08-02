package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDisc {
	
	
	@Test
	public void testCase1()
	{
		String expected = "Abc";
		
		String actual = "abc";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(actual, expected);
		
	
		
		System.out.println("After the assertion");
		
		sa.assertAll();
		
		
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
		
	SoftAssert sa = new SoftAssert();
	
	sa.assertFalse(isdisplay, "Test case failed from assert true");
	
	
	System.out.println("After the soft assert");
	
	sa.assertAll();
	
		
	}

}
