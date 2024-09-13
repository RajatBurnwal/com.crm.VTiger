package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImplementation implements IRetryAnalyzer{

	int count=1;
	int retryCount=3;
	@Override
	public boolean retry(ITestResult result) {
		
		//1<=3  //2<=3  //3<=3
		while(count<=retryCount)
		{
			count++;
			return true;
		}
		
		return false;
	}

}
