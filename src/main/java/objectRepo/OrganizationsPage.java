package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a pom class for Organizations Page
 * @author rajat burnwal
 * @version 8.28.24
 */
public class OrganizationsPage {

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createOrganizationsIcon;
	
	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOrganizationsIcon() {
		return createOrganizationsIcon;
	}
	
	/**
	 * This is business library to click on create new organizations icon
	 */
	public void clickOnCreateOrganizationsIcon()
	{
		getCreateOrganizationsIcon().click();
	}
}
