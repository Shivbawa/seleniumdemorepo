package testNGCostMasters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtons {
	
	ChromeDriver driver;
	
	@Test(priority=1)
	  public void checkLogin() {
		  
		     driver = new ChromeDriver();
			driver.get("http://testing.icecostmasters.in/");
			driver.manage().window().maximize();
			driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
			driver.findElement(By.id("Password")).sendKeys("Shiv@123");
			driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
			
			String actualPageTitle = driver.getTitle();
			
			String expectedPageTitle = "Costmasters";
			
			Assert.assertEquals(actualPageTitle, expectedPageTitle);
		  
		  
	  }
	
  @Test(priority=2)
  public void checkDefaultSelection() {
	  
	    
		WebElement salesRadio = driver.findElement(By.id("flexRadioDefault1"));
		boolean actularesult = salesRadio.isSelected();
		boolean expectedresult = false;
		
		Assert.assertEquals(actularesult, expectedresult);
		
	  
	  
  }
}
