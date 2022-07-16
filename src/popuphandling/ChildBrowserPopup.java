package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://groww.in/");
		
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("velocity.ctc@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
		
		
		
		

	}

}
