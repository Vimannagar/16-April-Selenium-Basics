package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSelectTagDropDown {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select selday = new Select(day);
		
		
		selday.selectByVisibleText("15");
		
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		
		Select selmonth = new Select(month);
		
		selmonth.selectByValue("12");
		
		
		
		 WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		 
		 Select selyear = new Select(year);
		 
		 selyear.selectByIndex(9);
		 
		 
		
		
		
		
		
		
	}

}
