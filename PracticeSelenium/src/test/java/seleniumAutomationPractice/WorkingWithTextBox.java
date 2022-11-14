package seleniumAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextBox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium webdrivers latest\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/input.xhtml");
		
		WebElement nameBox = driver.findElement(By.id("j_idt88:name"));
		
		nameBox.sendKeys("sudharsanan");
		
		WebElement appendBox = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']"));
		
		appendBox.sendKeys(" India");
		
		WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
		
		clearBox.clear();
		
		WebElement getTextbox = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		
		String newText = getTextbox.getAttribute("value");
		
		System.out.println(newText);
		
		WebElement boxDisabled = driver.findElement(By.id("j_idt88:j_idt93"));
		
		boolean enabled = boxDisabled.isEnabled();
		
		System.out.println(enabled);	
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
