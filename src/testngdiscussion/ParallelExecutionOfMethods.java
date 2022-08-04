package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecutionOfMethods {

	@Test
	public void launchChrome() {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/signup");

		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys("Velocity");

		WebElement mobilenumber = driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]"));

		mobilenumber.sendKeys("9876543210");

	}

	@Test
	public void launchFF() {
		System.setProperty("webdriver.gecko.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/signup");

		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys("Velocity");

		WebElement mobilenumber = driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]"));

		mobilenumber.sendKeys("9876543210");

	}
}
