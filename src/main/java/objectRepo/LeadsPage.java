package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a pom class for Leads Page
 * @author rajat burnwal
 * @version 8.28.24
 */
public class LeadsPage {

	@FindBy(xpath = "//img[@alt='Create Lead...']")
	private WebElement createLeadIcon;
	
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateLeadIcon() {
		return createLeadIcon;
	}
	
	/**
	 * this is a business library to click on create new lead icon in leads page
	 */
	public void clickOnCreateLeadIcon()
	{
		getCreateLeadIcon().click();
	}
}
