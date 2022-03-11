package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	
	public WebDriver driver;
	
	public GoogleSearch(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By serachText = By.name("q");
	By search_btn = By.name("btnK");
	By fb_link = By.xpath("//h3[text()='Facebook - Log In or Sign Up']");
	
	public void searchInput(String text) throws Exception {
		driver.findElement(serachText).sendKeys(text);
		Thread.sleep(1000L);
	}
	
	public void clickSearchButton() {
		driver.findElement(search_btn).click();
	}
	
	public void firstSearchOption() {
		driver.findElement(fb_link).click();
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
