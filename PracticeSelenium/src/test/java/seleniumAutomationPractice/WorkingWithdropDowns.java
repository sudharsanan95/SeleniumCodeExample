package seleniumAutomationPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithdropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\selenium webdrivers latest\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/select.xhtml");

		driver.manage().window().maximize();

		// 1. Which is your favorite UI Automation tool?

		WebElement dropDown1 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));

		Select select = new Select(dropDown1);

		select.selectByVisibleText("Cypress");

		// 2. Choose your preferred country.

		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();

		List<WebElement> countyitems = driver.findElements(By.xpath("//li[text()='AWS']/following::li"));

		for(WebElement ele1:countyitems) {

		String countrylist = ele1.getText();

		System.out.println(countrylist);
		
		}


	}


}
