package basicmethods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksIdentification {
	
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/");
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
			int numberoflinks = links.size();
			
			System.out.println(numberoflinks);
			
			for(int i=0; i<numberoflinks; i++)
			{
				WebElement element = links.get(i);
				
				String url = element.getAttribute("href");
				
				System.out.println(url);
				
				try {
				URL link = new URL(url);
				
				HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
				
				Thread.sleep(2000);
				
				
				httpconn.connect();
				
				int respcode = httpconn.getResponseCode();
				
				System.out.println(respcode);
				
				
				}
				catch (Exception e) {
					System.out.println("Exception arrives please check the code");
				}
				
			}
		
		
}

}
