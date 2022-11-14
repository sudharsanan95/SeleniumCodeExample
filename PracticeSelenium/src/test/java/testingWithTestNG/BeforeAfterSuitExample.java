package testingWithTestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class BeforeAfterSuitExample {

	//1. launch browser then open google and close it
	//2. launch browser then open bing and close it
	//3. launch browser then open yahoo and close it

	WebDriver driver;
	long startTime;
	long endTime;
	long totaltime;

	@BeforeSuite
	public void laucnBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudharshan\\eclipse-workspace03\\PracticeSelenium\\New Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@Test 
	public void openGoogle() {
	driver.get("https://www.google.com/");
	}

	@Test
	public void openBing() {
	driver.get("https://www.bing.com/");
	}

	@Test 
	public void openYahoo() {
	driver.get("https://in.search.yahoo.com/?fr2=inr");
	}

	@AfterSuite
	public void closeBrowser() {
	driver.close();
	endTime = System.currentTimeMillis();
	totaltime = endTime- startTime;
	System.out.println("total time take is" + totaltime);
	}

}
