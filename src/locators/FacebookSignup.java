package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
//		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys("Corporate");
		
WebElement mobilenumber = driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]"));
		
		mobilenumber.sendKeys("9876543210");
		
		
		 String enteredtext = mobilenumber.getAttribute("value");
		 
		 System.out.println(enteredtext);
		
		
	}

}
