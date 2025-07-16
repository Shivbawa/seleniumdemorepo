	package partMaster;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PartMaster {
  @Test
  public void f()  {
	  
	  ChromeDriver driver = new ChromeDriver();
		driver.get("http://testing.icecostmasters.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
		driver.findElement(By.id("Password")).sendKeys("Shiv@123");
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
		//driver.navigate().to("http://testing.icecostmasters.in/Masters/PartMaster/Index");
		//driver.findElement(By.id("oldCostingExport12")).click();
		
		//driver.findElement(By.id("oldCostingExportss")).click();
		
		driver.navigate().to("http://testing.icecostmasters.in/Masters/Machine/Add#");
		driver.findElement(By.xpath("//*[@id=\"machineNameTable\"]/tbody/tr[1]/td[4]/a[2]")).click();
		driver.switchTo().alert().accept();
  }
}
