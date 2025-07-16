package myTestSuite;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeTest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class HomePageExtent {

	ChromeDriver driver;
	static ExtentReports extentReports;
	static ExtentTest extentTest;
	ExtentSparkReporter htmlReporter;
	
	
	  @BeforeTest
	  public void beforeTest() {
		  htmlReporter = new ExtentSparkReporter("C:\\Users\\user\\eclipse-workspace\\SeleniumWebDriver\\Reports\\TestReport.html");
		  extentReports = new ExtentReports();
		  extentReports.attachReporter(htmlReporter);
	      driver = new ChromeDriver();	  
		  driver.get("http://testing.icecostmasters.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  }
	  
@Test
public void verifyHomePageTitle() {
	
	 
	  String ActualTitle =  driver.getTitle();
	  String ExpectedTitle = "Costmasters-Sign In";
	  
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
	  
}

@Test
public void verifyHomePageTitle2() {
	
	 
	  String ActualTitle =  driver.getTitle();
	  String ExpectedTitle = "QACostmasters-Sign In";
	  
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
	  
}

@BeforeMethod
public void createTest(Method method)
{    String MethodName = method.getName();
	 extentTest = extentReports.createTest(MethodName);
}
@Test
public void verifyHomePageTitle3() {
	
	 
	  String ActualTitle =  driver.getTitle();
	  String ExpectedTitle = "Costmasters-Sign In";
	  
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
	  
}

@AfterMethod
public void checkResult2(ITestResult result)
{
	if(result.getStatus()== ITestResult.FAILURE)
	{
		//extentTest.log(Status.FAIL, "Test has been failed");
		//extentTest.log(Status.INFO, "This is just for info");
	}
	
	else
	{
		extentTest.log(Status.PASS, "Test has been passed");
		extentTest.log(Status.INFO, "This is just for info for Pass");
	}
	
}




@AfterTest
public void afterTest() {
	  
	  extentReports.flush();
	  driver.close();
}

}
