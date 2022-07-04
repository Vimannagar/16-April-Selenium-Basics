package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonXpathLocators {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		using id locator
		
//		WebElement username = driver.findElement(By.id("txtUsername"));
//		
//		username.sendKeys("Admin");
//		
//		WebElement password = driver.findElement(By.id("txtPassword"));
//		
//		password.sendKeys("admin123");
//		
//		
//		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
//		
//		loginbutton.click();

		//		using name locator
		
//		WebElement username = driver.findElement(By.name("txtUsername"));
//		
//		username.sendKeys("Admin");
//		
		

		
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		password.sendKeys("admin123");
		
//		using className locator
		
//		WebElement loginbutton = driver.findElement(By.className("button"));
//		
//		loginbutton.click();
		
		
		
	//		using linkText locator
//			
//			WebElement forgotlink = driver.findElement(By.linkText("Forgot your password?"));
//			
//			forgotlink.click();
			
			
			
//			using partialLinkText locator
			
			
		WebElement linkforpassword = driver.findElement(By.partialLinkText("ur password?"));
		
		linkforpassword.click();
		
		
		
//		using tagname
		
		
	WebElement	username = driver.findElement(By.tagName("input"));
		
		
		
		
	}

}
