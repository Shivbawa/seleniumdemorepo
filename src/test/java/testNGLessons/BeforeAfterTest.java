package testNGLessons;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class BeforeAfterTest {
	ChromeDriver driver;
	
	 @BeforeTest
	  public void setUp() {
		  
		  driver = new ChromeDriver();	  
		  driver.get("https://www.costmasters.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
	  }
	 
  @Test
  public void verifyPageTitle() {
	  
	  String ActualPageTitle = driver.getTitle();
	  String ExpectedPageTitle = "QAQA";
	  Assert.assertEquals(ActualPageTitle, ExpectedPageTitle);
  }
  
  @Test
  public void verifyPageTitle2() {
	  
	  String ActualPageTitle = driver.getTitle();
	  String ExpectedPageTitle = "QAQA";
	  Assert.assertEquals(ActualPageTitle, ExpectedPageTitle);
  }
 

  @AfterTest
  public void tearDown() {
	  
	  driver.close();
	  
  }

}
