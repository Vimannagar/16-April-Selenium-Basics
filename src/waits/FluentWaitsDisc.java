package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitsDisc {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofMinutes(10))
									.pollingEvery(Duration.ofMillis(9))
									.ignoring(NoSuchElementException.class);
		
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();

		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@type='checkbox']"), true));
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		
	}

}
