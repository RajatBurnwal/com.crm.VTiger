package sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertPractice {

	@Test
	public void validatingHardAssertStrictLevel()
	{
		String expectedValue="raja";
		String actualValue="raja";
		
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("strict validation completed");
	}
	
	@Test
	public void validatingHardAssertContainsLevel()
	{
		String expectedValue="raja";
		String actualValue="Rajan";
		
		Assert.assertEquals(actualValue.contains(expectedValue), true);
		System.out.println("contains validation completed");
	}
	
	@Test
	public void validatingSoftAssertStrictLevel()
	{
		String expectedValue="raja";
		String actualValue="Rajan";
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualValue, expectedValue);
		System.out.println("strict level validation");
		s.assertAll();
	}
	
	@Test
	public void validatingSoftAssertContainsLevel()
	{
		String expectedValue="raja";
		String actualValue="Maharaja";
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(actualValue.contains(expectedValue));
		System.out.println("contains level validation");
		s.assertAll();
	}
}
