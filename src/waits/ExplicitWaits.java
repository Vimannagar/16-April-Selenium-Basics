package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		
//		To check the element is able to perform the click operation
		
		wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		WebElement hiddenbutton = driver.findElement(By.xpath("//*[@id='hidden']"));
		
		wait.until(ExpectedConditions.visibilityOf(hiddenbutton));
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
//		ExpectedConditions.textToBePresentInElement(hiddenbutton, "text")
		
		
//		ExpectedConditions.alertIsPresent();
		
//		ExpectedConditions.elementSelectionStateToBe(hiddenbutton, true);
		
		
	}

}
