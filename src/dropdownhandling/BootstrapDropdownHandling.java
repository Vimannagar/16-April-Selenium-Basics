package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BootstrapDropdownHandling {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://zoom.us/signup");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
		
		driver.findElement(By.xpath("//*[@id='select-0']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='select-item-select-0-5']")).click();
		
		driver.findElement(By.xpath("//*[@id='select-1']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='select-item-select-1-14']")).click();
		
		
	}

}
