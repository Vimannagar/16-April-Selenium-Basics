package testngdiscussion;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethodActual {
	WebDriver driver;
	
	@Test(priority = 1)
	public void getTitleOfPage()
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
	}
	
	
	@Test(priority = 2)
	public void loginToApp()
	{
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));

		username.sendKeys("Admin");

		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));

		pwd.sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='skjdhfkdshj']")).click();
	}
	
	
	@Test(priority = 3, dependsOnMethods = "loginToApp")
	public void navToAdminTab()
	{
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	}
	
	@Test(priority = 4, dependsOnMethods = "navToAdminTab")
	public void handlingCheckBox()
	{
		for(int i=2; i<=45; i++)
		{		
			if(i%2==0)
			{
		driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]")).click();
			}
		}	
	}
	

}
