package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryPractice {

	@Test(retryAnalyzer = genericUtility.RetryAnalyserImplementation.class)
	public void retryPractice()
	{
		Assert.fail();
		System.out.println("Hi");
	}
}
