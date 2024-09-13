package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass {

	public WebDriver driver=null;
	public static WebDriver sDriver=null;
	public PropertiesUtility pUtil=new PropertiesUtility();
	public SeleniumUtility sUtil=new SeleniumUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	
	
	@BeforeSuite
	public void dbConnection()
	{
		System.out.println("DB Connection successfull");
	}
	
	@BeforeClass
	public void launchBrowser() throws Exception
	{
		driver=new ChromeDriver();
		String URL=pUtil.readDataFromProperties("url");
		driver.get(URL);
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 10);
		sDriver=driver;
	}
	
	@BeforeMethod
	public void loginToApp() throws Exception
	{
		String UN=pUtil.readDataFromProperties("username");
		String PWD=pUtil.readDataFromProperties("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
	}
	
	@AfterMethod
	public void logoutFromApplication()
	{
		HomePage hp=new HomePage(driver);
		hp.signOutOperation(driver);
	}
	
	@AfterClass
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void dbDisconnection()
	{
		System.out.println("DB Disconnected");
	}
	
	
	
	
	
}

