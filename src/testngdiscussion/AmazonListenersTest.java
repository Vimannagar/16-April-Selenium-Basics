package testngdiscussion;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonListenersTest {
	static WebDriver driver;
	
	
	
	@Test(priority = 1)
	public void navToURL() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser

		
		
		driver.get("https://www.amazon.in/");
		
		Assert.fail();
	}
	
	@Test(priority = 2)
	public void searchTest() throws IOException
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile phone");
		
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	
		String actualtitle = driver.getTitle();
		
		String expectedtitle = "Amazon.in : mobilephone";
		
		
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	
	@Test(priority = 3)
	public void clickOnProductAndAdd()
	{
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@data-asin='B097YL5C2G']//*[@class='a-size-medium a-color-base a-text-normal']")).click();
	
		Set<String> allwinid = driver.getWindowHandles();
		
		for(String id:allwinid)
		{
			if(!(id.equals(parent)))
			{
				driver.switchTo().window(id);
			}
			
		}
		
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='attach-view-cart-button-form']//*[@class='a-button-input']")));
	
		
		driver.findElement(By.xpath("//*[@id='attach-view-cart-button-form']//*[@class='a-button-input']")).click();
	
	
		
		String actualtitle= driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base sc-product-title']")).getText();
	
		
		System.out.println(actualtitle);
	}
	
	

}
