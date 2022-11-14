package seleniumAutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe"); // to mention about driver
		
		WebDriver driver = new ChromeDriver(); // to launch browser
		
		driver.get("https://www.google.co.in/"); // to launch URL
		
		String url = driver.getCurrentUrl(); // to get current URL
		
		if(url.equals("https://www.google.co.in/"))
		{
			System.out.println(url + " is valid URL");
		}
		else
		{
			System.out.println(url + " is not valid URL");
		}
		
		String title = driver.getTitle();
		
		if(title.equals("Google"))
		{
			System.out.println(title + " is valid title");
		}
		else
		{
			System.out.println(title + " is invalid title");
		}
		
		Thread.sleep(5000);
		
		driver.close();
		
		}
	
}
	
	