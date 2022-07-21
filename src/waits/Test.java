package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		driver.findElement(By.xpath("//*[@id='checkbox']")).click();

		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@type='checkbox']"), true));

		driver.findElement(By.xpath("//*[@id='alert']")).click();

		wait.until(ExpectedConditions.alertIsPresent());

	}

}
