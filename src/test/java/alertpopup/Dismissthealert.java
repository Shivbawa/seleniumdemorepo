package alertpopup;

import static org.testng.Assert.assertEquals;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dismissthealert {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
	  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	  driver.findElement(By.id("confirmBox")).click();
	 String POPTEXT =  driver.switchTo().alert().getText();
	
	 Assert.assertEquals(POPTEXT, "Press a button!");
	 driver.switchTo().alert().dismiss();
	 
	
  }
}
