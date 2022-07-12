package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldOperations {

		public static void main(String[] args) throws InterruptedException {
		
			
			System.setProperty("webdriver.chrome.driver",
					"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();
	
			driver.manage().window().maximize();
	
			driver.get("https://jqueryui.com/draggable/");
			
			WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	
			//	switching to the iframe 
			driver.switchTo().frame(iframe);
			
			WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
			
			Actions act = new Actions(driver);
			
			act.clickAndHold(draggable).moveByOffset(50, 80).release(draggable).build().perform();
			
			Thread.sleep(2000);
			
			act.clickAndHold(draggable).moveByOffset(-20, -40).release(draggable).build().perform();
	
			
			
		}
	
	}
