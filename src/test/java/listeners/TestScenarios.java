package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.Itestlisten.class)
public class TestScenarios {

	
	@Test
	public void test_success() {
		System.out.println("This test is success");
	}
	@Test
	public void test_failure() {
		System.out.println("This test is failed");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test_skipped() {
		//System.out.println("This test is skipped");
		throw new SkipException("This test skipped");
	}
}
