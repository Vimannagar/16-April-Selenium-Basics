package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		
		username.sendKeys("Admin");
		
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	
	pwd.sendKeys("admin123");
	
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	}

}
