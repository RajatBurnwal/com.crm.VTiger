package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement contactHeader;
	
	public ContactInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactHeader() {
		return contactHeader;
	}
	
	/**
	 * This is a business library to fetch the contact header text
	 * @return
	 */
	public String getContactHeaderInfo()
	{
		String value=getContactHeader().getText();
		return value;
	}
}
