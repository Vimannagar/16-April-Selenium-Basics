package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));

		Actions act = new Actions(driver);
		
		
//		act.doubleClick(doubleclickbutton).perform();
		
		
//		Right click operation:
		
		
		
		act.contextClick(doubleclickbutton).perform();
		
		
	}

}
