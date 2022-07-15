package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));

		
		driver.switchTo().frame(iframe);
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		
		
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		
		Actions act =new Actions(driver);
		
		
		
//		act.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		
		
		act.dragAndDrop(drag, drop).perform();
		
		
		driver.switchTo().parentFrame();
		
//		scrolling by using JavascriptExecutor
		
		
		WebElement positionelement = driver.findElement(By.xpath("//*[text()='Position']"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		js.executeScript("window.scrollBy(0, 500)");
		
		WebElement addclasselement = driver.findElement(By.xpath("//*[text()='Add Class']"));
		
		js.executeScript("arguments[0].scrollIntoView();", addclasselement);
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView();", iframe);
		
		
		
	}
}
