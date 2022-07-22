package basicmethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;
import utility.ScreenShot;

public class FacebookSignup {
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		ExcelReader er = new ExcelReader();
		
		String surname = er.readData(2, 1);
	
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys(surname);
		
		WebElement mobilenumber = driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]"));
		
		mobilenumber.sendKeys("9876543210");
		
		
		 
		
	}

}
