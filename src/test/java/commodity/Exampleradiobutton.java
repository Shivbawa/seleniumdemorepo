package commodity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exampleradiobutton {
	
	ChromeDriver driver;
  @Test
  public void CheckLogin() {
	  
	  driver = new ChromeDriver();
	  driver.get("http://testing.icecostmasters.in/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
	  driver.findElement(By.id("Password")).sendKeys("Shiv@123");
	  driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
	  
	  String Actualresult = driver.getTitle();
	  String Expectedresult = "Costmasters";
	 
	  Assert.assertEquals(Actualresult, Expectedresult);
	  
	  
  }
  
  @Test
  public void CheckRadiobutton() {
	  
	WebElement ActualResultProcurement =  driver.findElement(By.id("flexRadioDefault2"));
	
    boolean Actualradiobuttonselection	= ActualResultProcurement.isSelected();
    boolean Expectedradiobuttonselection = true;
	  
    Assert.assertEquals(Actualradiobuttonselection,Expectedradiobuttonselection );
    
	  
  }
}
