package actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		
		Actions act = new Actions(driver);
		
//		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		List<WebElement> searchedoptions = driver.findElements(By.xpath("//*[@class='pcTkSc']//span[text()='selenium']"));
	
		
		for(WebElement option :searchedoptions)
		{
			String displayingoption = option.getText();
			
			System.out.println(displayingoption);
		}
	
	
	}

}
