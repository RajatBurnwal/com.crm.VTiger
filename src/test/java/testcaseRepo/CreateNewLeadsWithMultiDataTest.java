package testcaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class CreateNewLeadsWithMultiDataTest extends BaseClass {

	@Test
	public void createNewLeadsWithMultipleDataTest() throws Exception
	{
		String fName = eUtil.readDataFromExcel("Leads", 5, 1);
		String lName = eUtil.readDataFromExcel("Leads", 5, 2);
		String company = eUtil.readDataFromExcel("Leads", 5, 3);
		String title = eUtil.readDataFromExcel("Leads", 5, 4);
		String phone = eUtil.readDataFromExcel("Leads", 5, 5);
		String mobile = eUtil.readDataFromExcel("Leads", 5, 6);
		String email = eUtil.readDataFromExcel("Leads", 5, 7);
		String noOfEmployees = eUtil.readDataFromExcel("Leads", 5, 8);
		String street = eUtil.readDataFromExcel("Leads", 5, 9);
		String poBox = eUtil.readDataFromExcel("Leads", 5, 10);
		String postalCode = eUtil.readDataFromExcel("Leads", 5, 11);
		String city = eUtil.readDataFromExcel("Leads", 5, 12);
		String country = eUtil.readDataFromExcel("Leads", 5, 13);
		String state = eUtil.readDataFromExcel("Leads", 5, 14);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateLeadIcon();
		
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createLead(fName, lName, company, title, phone, mobile, email, noOfEmployees, street, poBox, postalCode, city, country, state);
		
	}
}
