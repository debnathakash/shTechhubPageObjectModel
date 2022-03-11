package test_methods;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Objects.FaceBook_page;

public class Facebook_Test extends BaseClass_Test{
	//public WebDriver driver;
	public FaceBook_page fbTest;
	
	/*
	 * @Test public void assertTitle() throws Exception { fbTest = new
	 * FaceBook_page(driver); fbTest.verifyTitle();
	 * 
	 * }
	 */
	
	@Test
	public void attemptFBLogin() {
		fbTest = new FaceBook_page(driver);
		
		fbTest.facebook_login("tesuser@gmail.com", "Test@123");
		
	}

}
