package sample;

import org.testng.annotations.Test;

//@Test
public class PracticeTestNG {

	@Test(enabled=false)
	public void createUser()
	{
		System.out.println("user created");
	}
	
	@Test(priority=-1,invocationCount = 2)
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	
//	@Ignore
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
}
