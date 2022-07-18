package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
//to get the parent window id 		
		String parentid = driver.getWindowHandle();
		
	
		System.out.println(parentid);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
//to get all window id 			
		Set<String> allwindowid = driver.getWindowHandles();
		
		int numberofwindow = allwindowid.size();
		
		System.out.println("Total number of windows are: "+numberofwindow);
		
		String [] winid = new String[numberofwindow];
		
		int i=0;
		for(String id :allwindowid)
		{
			winid[i]= id;
			
			i++;
		}
		
		
		for(String arrayelement:winid)
		{
			System.out.println(arrayelement);
		}
		
		
		
		driver.switchTo().window(winid[1]);
		
		
		driver.findElement(By.xpath("//*[@class='btn-orange trial-btn pulse ']")).click();
			
			
//	To close the window which has current focus of selenium
		
		driver.close();
		
		
//		To close all the window at a time
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}
	
}
