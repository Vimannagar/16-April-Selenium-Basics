package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//*[contains(@id,'u_0_b_')]")).click();
		
		Actions act = new Actions(driver);
		
		act.sendKeys("Velocity")
		.sendKeys(Keys.TAB)
		.sendKeys("Corporate")
		.sendKeys(Keys.TAB)
		.sendKeys("9876543210")
		.build().perform();
		
		
		
		
	}

}
