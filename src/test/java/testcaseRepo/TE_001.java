package testcaseRepo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;

@Listeners(genericUtility.ListenersImplementation.class)
public class TE_001 extends BaseClass{

	@Test
	public void demoTest()
	{
//		Assert.fail();
		System.out.println("Script 1");
//		Reporter.log("script 1 executed");
	}
	
	@Test
	public void demo1Test()
	{
		Assert.fail();
	}
}
