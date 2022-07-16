package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleWindowHandling {
	
	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
//	to get the parent window id 		
			String parentid = driver.getWindowHandle();
			
		
			System.out.println(parentid);
			
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			
// to get all window id 			
			Set<String> allwindowid = driver.getWindowHandles();
			

			
			for(String winid:allwindowid)
			{
				System.out.println(winid);
				if(!(parentid.equals(winid)))
				{
					
//					Switching to the child window 
					driver.switchTo().window(winid);
				}
			}
			
			driver.findElement(By.xpath("//*[@class='btn-orange trial-btn pulse ']")).click();
		
//	Switching back to the parent window
			driver.switchTo().window(parentid);
	
	WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));

	username.sendKeys("Admin");

	WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));

	pwd.sendKeys("admin123");

	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

	
	}


