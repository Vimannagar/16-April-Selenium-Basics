package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/resizable/");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));

		
		driver.switchTo().frame(iframe);
		
		WebElement cornerarrow = driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		
		
		Actions act = new Actions(driver);
		
		
	
		act.clickAndHold(cornerarrow).moveByOffset(50, 60).release(cornerarrow).build().perform();

		
		//		switching out to the parent frame
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//*[text()='Draggable']")).click();
		

	}

}
