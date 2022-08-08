package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.LoginPage;
import pages.LoginPageAdvance;

public class BaseTest {
	static WebDriver driver;
	LoginPageAdvance lp;
	@BeforeSuite
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@BeforeClass
	public void createObject()
	{
		lp = new LoginPageAdvance(driver);
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
