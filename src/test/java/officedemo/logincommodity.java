package officedemo;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logincommodity {
	ChromeDriver driver;
  @Test(priority = 1)
  public void login() {
	  
	  driver = new ChromeDriver();
	  
	  driver.get("http://testing.icecostmasters.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
	  driver.findElement(By.id("Password")).sendKeys("Shiv@123");
	  driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
	  String ActualTitle =  driver.getTitle();
	  String ExpectedTitle = "Costmasters";
	  
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
	  
	  
  }
  
  @Test(priority = 2)
  public void Radiobutton() {
	  
	WebElement Salesradio =  driver.findElement(By.id("flexRadioDefault1"));
	boolean Actualradiobutton = Salesradio.isSelected();
	boolean ExpectedRadioButton = false;
	Assert.assertEquals(Actualradiobutton, ExpectedRadioButton);
	  
	  
  }
  @Test(priority = 3)
  public void CommoditySave() {
	  
	  driver.findElement(By.xpath("//*[@id=\"sidebar-scroll\"]/div[1]/div[2]/div/div/div/nav/ul/li[2]/a/span")).click();
	  driver.findElement(By.linkText("Commodity")).click();
		/*
		 * WebElement Commodityselect = driver.findElement(By.id("commodityDropdown"));
		 * Select commoditydropdownselect = new Select(Commodityselect);
		 * 
		 * commoditydropdownselect.selectByVisibleText("Ferrous Metal");
		 * driver.findElement(By.id("subGroupClassification")).sendKeys("Steel");
		 * driver.findElement(By.id("SpecificGradeText")).sendKeys("CRCA DD-1 0.5");
		 * driver.findElement(By.id("groupDensity")).sendKeys("7.85");
		 * driver.findElement(By.xpath("//*[@id=\"tab2Save\"]")).click();
		 */
	  
	  
  }
  
  @Test(priority = 4)
  public void CommoditySearch() throws IOException {
	  
	  driver.findElement(By.xpath("//*[@id=\"SubGroupTable_filter\"]/label/input")).sendKeys("Steel");
	  String Searchresult =  driver.findElement(By.xpath("//*[@id=\"SubGroupTable\"]/tbody/tr[3]/td[3]")).getText();
	  
	  boolean ActualSearchresult = Searchresult.contains("Steel");
	  boolean ExpectedSearchresult = true;
	  Assert.assertEquals(ActualSearchresult, ExpectedSearchresult);
	  
	//List<WebElement> lists = driver.findElements(By.xpath("//*[@id=\"SubGroupTable\"]/tbody/tr"));
	//int count = lists.size();
	//System.out.println(count);
	
	//for (WebElement ele : lists)
//	{
	//	String Resultssearch = ele.getText();
	//boolean Actualssearch =	Resultssearch.contains("Steel");
	//boolean Expectedsearch = true;
	//Assert.assertEquals(Actualssearch, Expectedsearch);
	
	  
		
	}
  
  @Test(priority=5)
  public void clickImport() throws InterruptedException
  {
	 // driver.findElement(By.xpath("//*[@id=\"tab2Form\"]/div/div[5]/div/button")).click();
	  
	  driver.findElement(By.id("attachmentcommodity")).sendKeys("C:\\Users\\user\\Downloads\\New specific grade addition_16-07-2024.xlsx");
     Thread.sleep(2000);
	  String msg = driver.findElement(By.className("toast-message")).getText();
      System.out.println(msg);
  }
	
	   
  
	

	  
}
  
