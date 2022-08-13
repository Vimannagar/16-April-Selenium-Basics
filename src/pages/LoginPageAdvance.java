package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAdvance {
	WebDriver driver;
	@FindBy(xpath = "//input[@name='txtUsername']")
	WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbutton;
	
	

	public LoginPageAdvance(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void enterCredentialsAndLogin() {
		username.sendKeys("Admin");

		password.sendKeys("admin123");

		loginbutton.click();
	}

	public void getTitleOfPage() {
		String titleofpage = driver.getTitle();

		System.out.println(titleofpage);
	}

}
