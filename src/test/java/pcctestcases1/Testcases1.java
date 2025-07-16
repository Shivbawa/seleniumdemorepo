package pcctestcases1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases1 {
	
	ChromeDriver driver;
  @Test
  public void Login () throws InterruptedException {
	  
	  driver = new ChromeDriver();
	  driver.get("http://testing.icecostmasters.in/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
	  driver.findElement(By.id("Password")).sendKeys("Shiv@123");
	  driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/a")).click();
	  
	  String Actualresult = driver.getTitle();
	  String Expectedresult = "Costmasters";
	 
	 Assert.assertEquals(Actualresult, Expectedresult);
	 
	 driver.findElement(By.linkText("Price Approvals")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.linkText("PCC")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.linkText("PCC Change Impact")).click();

  }
}
