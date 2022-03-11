package test_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchOperation_Test extends BaseClass_Test {
	//public WebDriver driver;
	public GoogleSearch search;
	
	
	@Test
	public void searchOperation() throws Exception {
		search = new GoogleSearch(driver);
		search.searchInput("Facebook");
		search.clickSearchButton();
		search.firstSearchOption();
		
	}
	////h3[text()='Facebook - Log In or Sign Up']
	
	
	

}
