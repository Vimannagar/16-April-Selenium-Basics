package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//*[contains(@id,'u_0_b_')]"));
		
		
		Actions act  = new Actions(driver);
		
//		performing control + a operation
		act.sendKeys(firstname, "Velocity")
		.keyDown(Keys.CONTROL).sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
//		performing control + c operation		
		act.keyDown(Keys.CONTROL).sendKeys("c")
		.keyUp(Keys.CONTROL)
		.build().perform();

//		performing control + v operation	
		act.sendKeys(Keys.TAB)
		.keyDown(Keys.CONTROL).sendKeys("v")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		
		WebElement mobilenumber = driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]"));
		
		mobilenumber.sendKeys("9876543210");
		
		
		 String enteredtext = mobilenumber.getAttribute("value");
		 
		 System.out.println(enteredtext);
		
	}
	

}
