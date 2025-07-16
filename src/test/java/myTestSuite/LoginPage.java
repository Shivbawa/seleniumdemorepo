package myTestSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginPage {
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() {
		  
	      driver = new ChromeDriver();	  
		  driver.get("http://testing.icecostmasters.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  }
	  
  @Test
  public void verifyLogin() {
	  driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
	  driver.findElement(By.id("Password")).sendKeys("Shiv@123");
	  driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
	  String ActualTitle =  driver.getTitle();
	  String ExpectedTitle = "Costmasters";
	  
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
  }
 

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
