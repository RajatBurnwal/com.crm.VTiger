package testcaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class CreateNewLeadsWithFirstNameLastCompanyTest extends BaseClass {

	@Test
	public void createNewLeadsWithFirstNameLastNameCompanyTest() throws Exception
	{
		String fName = eUtil.readDataFromExcel("Leads", 2, 1);
		String lName = eUtil.readDataFromExcel("Leads", 2, 2);
		String company = eUtil.readDataFromExcel("Leads", 2, 3);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateLeadIcon();
		
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createLead(fName, lName, company);
		
	}
	
	@Test
	public void practiceTest()
	{
		System.out.println("Practice Test Script Executed");
		System.out.println("Checking jenkins");
	}
}
