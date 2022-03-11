package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import test_methods.BaseClass_Test;

public class FaceBook_page {
	
	public WebDriver driver;
	public FaceBook_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By username_textbox = By.xpath("//input[@id='email']");
	By password_textbox = By.name("pass");
	By login_button = By.name("login");
	
	/*
	 * public void verifyTitle() throws Exception {
	 * Assert.assertEquals(driver.getTitle(), "Facebook â€“ log in or sign up");
	 * Thread.sleep(2000L); }
	 */
	
	public void facebook_login(String username, String password)  {
		
		driver.findElement(username_textbox).sendKeys(username);
		driver.findElement(password_textbox).sendKeys(password);
		driver.findElement(login_button).click();
	}
	
}
