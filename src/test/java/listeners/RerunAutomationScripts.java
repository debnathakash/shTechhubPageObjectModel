package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunAutomationScripts implements IRetryAnalyzer{

	public static int count = 0;
	public static int maxCount = 5;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (count<maxCount) {
			count++;
			return true;
			
		}
		
		return false;
	}

}
