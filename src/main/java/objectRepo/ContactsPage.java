package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a pom class for Contacts page
 * @author rajat burnwal
 * @version 8.28.24
 */
public class ContactsPage {

	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement createContactsIcon;
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateContactsIcon() {
		return createContactsIcon;
	}
	
	/**
	 * This is a business library to perform click on create new contacts icon
	 */
	public void clickOnCreateContactsIcon()
	{
		getCreateContactsIcon().click();
	}
}
