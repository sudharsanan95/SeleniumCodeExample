package seleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium webdrivers latest\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/button.xhtml");
		
		driver.manage().window().maximize();
		
		// 1. get position of submit button
		
		WebElement submitbutton = driver.findElement(By.id("j_idt88:j_idt94"));
		
		Point  submitbuttonlocation = submitbutton.getLocation();
		
		System.out.println(submitbuttonlocation);
		
		// 2. find save button color
		
		WebElement savebutton = driver.findElement(By.id("j_idt88:j_idt96"));
		
		String savebuttoncolor = savebutton.getCssValue("background-color");
		
		System.out.println(savebuttoncolor);
		
		// 3. Find the height and width of the button
		
		WebElement buttonsize = driver.findElement(By.id("j_idt88:j_idt98"));
		
		int buttonheight = buttonsize.getSize().getHeight();

		int buttonwidth = buttonsize.getSize().getWidth();
		
		System.out.println("height is : " + buttonheight + " width is: " + buttonwidth);
		
		// 4. Confirm if the button is disabled
		
		WebElement button = driver.findElement(By.id("j_idt88:j_idt92"));
		
		String buttondisabled = button.getAttribute("aria-disabled");
		
		System.out.println("is button disabled: " + buttondisabled);
		
		// 5. Click and Confirm title.
		
		WebElement title = driver.findElement(By.id("j_idt88:j_idt90"));
		
		title.click();
		
		WebElement title1 = driver.findElement(By.xpath("//div[@class='route-bar-breadcrumb']"));
		
		String title2 = title1.getText();
		
		boolean result = title2.equals("/ Dashboard");
		
		System.out.println("is title confimed: " + result);
		
		driver.close();



	}

}
