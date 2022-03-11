package listeners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetryClass {
	public static WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test(retryAnalyzer = RerunAutomationScripts.class)
	public void verifyTitle() {
		//assertEquals(driver.getTitle(), "google");
		Assert.assertEquals(driver.getTitle(), "google");
	}
	
	@AfterTest
	public void trearDown() {
		driver.quit();
	}

}
