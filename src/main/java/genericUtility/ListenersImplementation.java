package genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListenersImplementation implements ITestListener {

	ExtentReports report;
	ExtentTest test;
	JavaUtility jUtil=new JavaUtility();
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		test=report.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
//		Reporter.log(methodName+"successfull");
		test.log(Status.PASS, methodName+"successfull");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
//		Reporter.log(methodName+"failed");
		test.log(Status.FAIL, methodName+"failed");
		test.log(Status.INFO,result.getThrowable());
		String dateTimeStamp=jUtil.getDateAndTime("dd-MM-YYYY hh-mm-ss");
		
		TakesScreenshot ts=(TakesScreenshot)BaseClass.sDriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\ExtentReports\\Screenshot\\"+methodName+dateTimeStamp+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(dest.getAbsolutePath());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
//		Reporter.log(methodName+"skipped");
		test.log(Status.SKIP, methodName+"skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		String dateTimeStamp=jUtil.getDateAndTime("dd-MM-YYYY hh-mm-ss");
		
		//Configuration of the test reports
		ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\ExtentReports\\Report-"+dateTimeStamp+".html");
		htmlReport.config().setDocumentTitle("Vtiger Application execution");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("Build 2 Vtiger application");
		
		//Creating the report
		report=new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("Base URL", "https://localhost:8888");
		report.setSystemInfo("Base Browser", "chrome");
		report.setSystemInfo("Base OS", "Windows");
		report.setSystemInfo("Base Environment", "Testing_Env");	
		report.setSystemInfo("Reporter Name", "Rajat");	
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		//Report generation
		report.flush();
	}
	
	

}
