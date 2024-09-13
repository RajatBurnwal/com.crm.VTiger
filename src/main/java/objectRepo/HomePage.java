package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a pom class for Home Page
 * @author rajat burnwal
 * @version 8.28.24
 */
public class HomePage {

	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Organizations']")
	private WebElement organizationsMenu;
	
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath = "(//td[@class='small']/img)[1]")
	private WebElement administratorIcon;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutOption;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getOrganizationsMenu() {
		return organizationsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAdministratorIcon() {
		return administratorIcon;
	}

	public WebElement getSignOutOption() {
		return signOutOption;
	}
	
	/**
	 * This is a business library to click on Leads menu
	 */
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	
	/**
	 * This is a business library to click on Organizations menu
	 */
	public void clickOnOrganizationsMenu()
	{
		getOrganizationsMenu().click();
	}
	
	/**
	 * This is a business library to click on Contacts menu
	 */
	public void clickOnContactsMenu()
	{
		getContactsMenu().click();
	}
	
	/**
	 * This is a business library to perform signout operation from the application
	 * @param driver
	 */
	public void signOutOperation(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(getAdministratorIcon()).perform();
		getSignOutOption().click();
		
	}
	
}
