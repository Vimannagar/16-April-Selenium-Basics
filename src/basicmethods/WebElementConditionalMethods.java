package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConditionalMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));

		username.sendKeys("Admin");

		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));

		pwd.sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();

		WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_27']"));
		boolean ischeckboxdisplayed= checkbox.isDisplayed();
		
		System.out.println("Checkbox is displayed on  page status is "+ischeckboxdisplayed);
		boolean isenabled = checkbox.isEnabled();

		System.out.println("is enabled variable value is " + isenabled);// true

		boolean isselected = checkbox.isSelected();

		System.out.println("isselected variable value is " + isselected);//false
		
		
		checkbox.click();
		
		boolean checkedafterclick = checkbox.isSelected();//true
		
		System.out.println("checked after click status is "+checkedafterclick);
		
		
		WebElement hiddenelement = driver.findElement(By.xpath("//*[@id='likedOrSharedEmployeeForm_id']"));

		
		boolean isvisibleoverpage = hiddenelement.isDisplayed();
		
		System.out.println(isvisibleoverpage);//false
		
		
	}
}
