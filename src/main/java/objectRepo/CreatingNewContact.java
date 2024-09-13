package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContact {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement fName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lName;
	
	@FindBy(xpath = "//input[@id='title']")
	private WebElement title;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewContact(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getTitle() {
		return title;
	}
	
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	/**
	 * This is a business library to create new contact
	 * @param fName
	 * @param lName
	 * @param title
	 */
	public void createContact(String fName, String lName, String title)
	{
		getfName().sendKeys(fName);
		getlName().sendKeys(lName);
		getTitle().sendKeys(title);
		getSaveButton().click();
	}
}
