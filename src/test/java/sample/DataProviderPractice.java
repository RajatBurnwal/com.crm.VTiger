package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

	@Test(dataProvider = "checkData")
	public void dataProviderPractice(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider(name="checkData")
	public Object[][] getData()
	{		
		return new Object[][] {{"Robin","helloWorld"},{"Robin123","helloWorld123"},{"Ravi", "hello"}};	
	}
}
