package myTestSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HomePage {
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() {
		  
	      driver = new ChromeDriver();	  
		  driver.get("http://testing.icecostmasters.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  }
	  
  @Test
  public void verifyHomePageTitle() {
	  
	  String ActualTitle =  driver.getTitle();
	  String ExpectedTitle = "QACostmasters-Sign In";
	  
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
	  
  }


  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
