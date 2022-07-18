package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
//	month, year, date
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));

		
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		
		
		while(true)
		{
		
		String title = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		
		
		System.out.println(title);
		
		if(!(title.equals("July 2021")))
		{
		
		driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		else
		{
			break;
		}
		
		}
		
		
		driver.findElement(By.xpath("//*[@data-handler='selectDay']//a[text()='7']")).click();
		
		
	}

}
