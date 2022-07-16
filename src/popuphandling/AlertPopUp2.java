package popuphandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ScreenShot;

public class AlertPopUp2 {
	
	
	public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	

	driver.findElement(By.xpath("//*[@name='confirmation']")).click();

//	to get the text available on alert pop up
	String text = driver.switchTo().alert().getText();
	
	System.out.println(text);
	
	//	clicking on cancel button
	
	driver.switchTo().alert().dismiss();
	}
	
	
}
