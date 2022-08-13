package testngdiscussion;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PolicyBazaar {
	
	
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser

		
		
		driver.get("https://www.policybazaar.com/");
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//*[@class='prd-icon add shadowHandler short']//i[@class='icon-bg homeIconsBg health-insurance']")).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='submitButton']")).click();
		
		WebElement agedd = driver.findElement(By.xpath("//*[@id='Self']"));
		
		Select sel = new Select(agedd);
		
		sel.selectByVisibleText("21 yr");
		
		driver.findElement(By.xpath("//*[@id='submitButton']")).click();
		
		driver.findElement(By.xpath("//*[@id='txtcity']")).sendKeys("425201");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='divcitylist']//span")));
		
		driver.findElement(By.xpath("//*[@id='divcitylist']//span")).click();
		
		driver.findElement(By.xpath("//*[@id='fullname']")).sendKeys("Gourav");
		
		driver.findElement(By.xpath("//*[@id='pmobile']")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		
		
	}

}
