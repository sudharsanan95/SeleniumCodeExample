package seleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementsWithLink  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium webdrivers latest\\chromedriver.exe"); // driver location
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");
		
		driver.manage().window().maximize();
				
		driver.findElement(By.linkText("Go to Dashboard")).click();
		
		Thread.sleep(2000);
		
		driver.close();
			
		

	}

}
