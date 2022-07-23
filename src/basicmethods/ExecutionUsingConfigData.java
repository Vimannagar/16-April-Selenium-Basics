package basicmethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.ReadDataFromProperties;

public class ExecutionUsingConfigData {
	
	public static void main(String[] args) throws IOException {

		WebDriver driver;
		
		String browsername = ReadDataFromProperties.getPropData("browser");
		
		if(browsername.equals("firefox"))
		{

			System.setProperty("webdriver.gecko.driver","F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\geckodriver-v0.31.0-win64\\geckodriver.exe");

			
			driver= new FirefoxDriver();
			
		}
		else
		{
		
		System.setProperty("webdriver.chrome.driver","F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(ReadDataFromProperties.getPropData("testsiteurl"));
		
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));

		username.sendKeys(ReadDataFromProperties.getPropData("username"));

		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));

		pwd.sendKeys(ReadDataFromProperties.getPropData("pwd"));

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}

}
