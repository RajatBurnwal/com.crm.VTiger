package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadPage {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement fName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lName;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath = "//input[@id='designation']")
	private WebElement title;
	
	@FindBy(xpath = "//input[@id='noofemployees']")
	private WebElement noOfEmployees;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phoneNo;
	
	@FindBy(xpath = "//input[@id='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@name='lane']")
	private WebElement street;
	
	@FindBy(xpath = "//input[@id='pobox']")
	private WebElement poBox;
	
	@FindBy(xpath = "//input[@id='code']")
	private WebElement postalCode;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@id='state']")
	private WebElement state;
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement country;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getNoOfEmployees() {
		return noOfEmployees;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create new lead
	 * @param fName
	 * @param lName
	 * @param company
	 */
	public void createLead(String fName, String lName, String company)
	{
		getfName().sendKeys(fName);
		getlName().sendKeys(lName);
		getCompany().sendKeys(company);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new lead
	 * @param fName
	 * @param lName
	 * @param company
	 * @param title
	 * @param phone
	 * @param mobile
	 * @param email
	 * @param noOfEmployees
	 * @param street
	 * @param poBox
	 * @param postalCode
	 * @param city
	 * @param country
	 * @param state
	 */
	public void createLead(String fName, String lName, String company,
			String title,String phone, String mobile, String email,
			String noOfEmployees, String street, String poBox, String postalCode,
			String city, String country, String state)
	{
		getfName().sendKeys(fName);
		getlName().sendKeys(lName);
		getCompany().sendKeys(company);
		getTitle().sendKeys(title);
		getPhoneNo().sendKeys(phone);
		getMobile().sendKeys(mobile);
		getEmail().sendKeys(email);
		getNoOfEmployees().sendKeys(noOfEmployees);
		getStreet().sendKeys(street);
		getPoBox().sendKeys(poBox);
		getPostalCode().sendKeys(postalCode);
		getCity().sendKeys(city);
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new lead
	 * @param fName
	 * @param lName
	 * @param company
	 * @param title
	 * @param phone
	 * @param mobile
	 * @param email
	 * @param noOfEmplyees
	 */
	public void createLead(String fName, String lName, String company, String title, String phone,
			String mobile, String email, String noOfEmplyees)
	{
		getfName().sendKeys(fName);
		getlName().sendKeys(lName);
		getCompany().sendKeys(company);
		getTitle().sendKeys(title);
		getPhoneNo().sendKeys(phone);
		getMobile().sendKeys(mobile);
		getEmail().sendKeys(email);
		getNoOfEmployees().sendKeys(noOfEmplyees);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new lead
	 * @param fName
	 * @param lName
	 * @param company
	 * @param street
	 * @param poBox
	 * @param postalCode
	 * @param city
	 * @param country
	 * @param state
	 */
	public void createLead(String fName, String lName, String company, String street, String poBox,
			String postalCode, String city, String country, String state)
	{
		getfName().sendKeys(fName);
		getlName().sendKeys(lName);
		getCompany().sendKeys(company);
		getStreet().sendKeys(street);
		getPoBox().sendKeys(poBox);
		getPostalCode().sendKeys(postalCode);
		getCity().sendKeys(city);
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		getSaveButton().click();
	}
}
