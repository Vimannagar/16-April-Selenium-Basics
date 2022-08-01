package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActualAnnotations {

	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("Open the browser");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("Close the browser");
	}
	
	
	@BeforeTest
	public void navToElectronics()
	{
		System.out.println("Navigate from home page to Electronics page");
	}
	
	
	@AfterTest
	public void navToHomePage()
	{
		System.out.println("Navigate back to home page from Electronics page");
	}
	
	@BeforeClass
	public void goToMobileSection()
	{
		System.out.println("Go to mobile section");
	}
	
	@AfterClass
	public void navBackToElectronics()
	{
		System.out.println("Navigate back to electronics module");
	}
	
	
	@BeforeMethod
	public void searchMobile()
	{
		System.out.println("Search specific mobile");
	}
	
	@AfterMethod
	public void navBackToSearchPage()
	{
		System.out.println("Navigate back to search page");
	}
	
	@Test
	public void buyMobile()
	{
		System.out.println("Buy Mobile test");
	}
	
}
