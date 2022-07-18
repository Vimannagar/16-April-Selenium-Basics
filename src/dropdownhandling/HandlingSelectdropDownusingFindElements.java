package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSelectdropDownusingFindElements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		
	List<WebElement> dayvalues = driver.findElements(By.xpath("//*[@id='day']//option"));
		
	int numberofoptions = dayvalues.size();
	
	System.out.println("Number of options present in the dropdown is : "+numberofoptions);
	
	for(WebElement value :dayvalues)
	{
		String day = value.getText();
		System.out.println(day);
		
		if(day.equals("15"))
		{
			value.click();
			break;
		}
		
		
		
		
	}
	
	
	
	
	}

}
