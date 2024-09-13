package genericUtility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * This is a generic class having all Selenium related functions
 * @author rajat burnwal
 * @version 8.28.24
 */
public class SeleniumUtility {

	public Actions act=null;
	public Select sel=null;
	/**
	 * This is a generic method to maximize the browser
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This is generic method for giving implicit wait
	 * @param driver
	 * @param time
	 */
	public void implicitWait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	////////*******Actions class methods********//////////
	
	/**
	 * This is a generic method to perform mouse hovering action on an element
	 * @param driver
	 * @param element
	 */
	public void mouseHoverActionOnElement(WebDriver driver, WebElement element)
	{
		act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This is a generic method to perform right click operation on an element
	 * @param driver
	 * @param element
	 */
	public void rightClickActionOnElement(WebDriver driver, WebElement element)
	{
		act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This is a generic method to perform double click operation on an element
	 * @param driver
	 * @param element
	 */
	public void doubleClickActionOnElement(WebDriver driver, WebElement element)
	{
		act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * This is a generic method to perform scrolling operation to an element
	 * @param driver
	 * @param element
	 */
	public void scrollingActionToElement(WebDriver driver, WebElement element)
	{
		act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	////////********Select class methods******////////
	
	/**
	 * This is a generic method to select option from dropdown by index
	 * @param dropdownElement
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropdownElement, int index)
	{
		sel=new Select(dropdownElement);
		sel.selectByIndex(index);
	}
	
	/**
	 * This is a generic method to select option from dropdown by value
	 * @param dropdownElement
	 * @param index
	 */
	public void selectOptionByValue(WebElement dropdownElement, String value)
	{
		sel=new Select(dropdownElement);
		sel.selectByValue(value);
	}
	
	/**
	 * This is a generic method to select option from dropdown by visible text
	 * @param dropdownElement
	 * @param index
	 */
	public void selectOptionByVisisbleText(WebElement dropdownElement, String visibleText)
	{
		sel=new Select(dropdownElement);
		sel.selectByVisibleText(visibleText);
	}
	
	/**
	 * This is a generic method to fetch all the options from the dropdown
	 * @param dropdownElement
	 * @return
	 */
	public List<WebElement> getAllOptionsFromDropdown(WebElement dropdownElement)
	{
		sel=new Select(dropdownElement);
		List<WebElement> allOptions = sel.getOptions();
		return allOptions;
	}
	
	
}
