package basicmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		
		ChromeDriver driver = new ChromeDriver();
			
		WebDriver driver2 = new ChromeDriver();
		
		RemoteWebDriver driver3 = new ChromeDriver();
		
		
		
		
		
	}

}
 