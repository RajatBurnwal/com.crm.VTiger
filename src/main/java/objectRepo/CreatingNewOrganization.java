package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganization {

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement organizationName;
	
	@FindBy(xpath = "//input[@name='website']")
	private WebElement website;
	
	@FindBy(xpath = "//input[@id='employees']")
	private WebElement noOfEmployees;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath = "//input[@id='otherphone']")
	private WebElement otherPhone;
	
	@FindBy(xpath = "//input[@id='email1']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billingAddress;
	
	@FindBy(xpath = "//input[@id='bill_city']")
	private WebElement billingCity;
	
	@FindBy(xpath = "//input[@id='bill_state']")
	private WebElement billingState;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewOrganization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganizationName() {
		return organizationName;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getNoOfEmployees() {
		return noOfEmployees;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getOtherPhone() {
		return otherPhone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create new organization
	 * @param organizationName
	 * @param website
	 * @param noOfEmployees
	 */
	public void createOrganization(String organizationName, String website, String noOfEmployees)
	{
		getOrganizationName().sendKeys(organizationName);
		getWebsite().sendKeys(website);
		getNoOfEmployees().sendKeys(noOfEmployees);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new organization
	 * @param organizationName
	 * @param website
	 * @param noOfEmployees
	 * @param phone
	 * @param otherPhone
	 * @param email
	 */
	public void createOrganization(String organizationName, String website, String noOfEmployees,
			String phone, String otherPhone, String email)
	{
		getOrganizationName().sendKeys(organizationName);
		getWebsite().sendKeys(website);
		getNoOfEmployees().sendKeys(noOfEmployees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(otherPhone);
		getEmail().sendKeys(email);
		getSaveButton().click();
	}
	
	/**
	 * This is business library to create new organization
	 * @param organizationName
	 * @param website
	 * @param billingAddress
	 * @param billingCity
	 * @param billingState
	 */
	public void createOrganization(String organizationName, String website, String billingAddress,
			String billingCity, String billingState)
	{
		getOrganizationName().sendKeys(organizationName);
		getWebsite().sendKeys(website);
		getBillingAddress().sendKeys(billingAddress);
		getBillingCity().sendKeys(billingCity);
		getBillingState().sendKeys(billingState);
		getSaveButton().click();
	}
	
	/**
	 * This is business library to create new organization
	 * @param organizationName
	 * @param website
	 * @param noOfEmployees
	 * @param phone
	 * @param otherPhone
	 * @param email
	 * @param billingAddress
	 * @param billingCity
	 * @param billingState
	 */
	public void createOrganization(String organizationName, String website, String noOfEmployees,
			String phone, String otherPhone, String email, String billingAddress, String billingCity,
			String billingState)
	{
		getOrganizationName().sendKeys(organizationName);
		getWebsite().sendKeys(website);
		getNoOfEmployees().sendKeys(noOfEmployees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(otherPhone);
		getEmail().sendKeys(email);
		getBillingAddress().sendKeys(billingAddress);
		getBillingCity().sendKeys(billingCity);
		getBillingState().sendKeys(billingState);
		getSaveButton().click();
	}

}
