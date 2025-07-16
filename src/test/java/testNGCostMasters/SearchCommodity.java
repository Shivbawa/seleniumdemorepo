package testNGCostMasters;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCommodity {
	ChromeDriver driver;
  @Test
  public void f() throws IOException  {
	  
	    driver = new ChromeDriver();
		driver.get("http://testing.icecostmasters.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
		driver.findElement(By.id("Password")).sendKeys("Shiv@123");
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"sidebar-scroll\"]/div[1]/div[2]/div/div/div/nav/ul/li[2]/a/span")).click();
		driver.findElement(By.linkText("Commodity")).click();
		driver.findElement(By.xpath("//*[@id=\"SubGroupTable_filter\"]/label/input")).sendKeys("Steel");
		String searchResult = driver.findElement(By.xpath("//*[@id=\"SubGroupTable\"]/tbody/tr[5]/td[3]")).getText();
		//Assert.assertEquals(searchResult, "Steel");
		
		//boolean boolresult = searchResult.contains("Steel");
		//boolean expectedResult = true;
		
		//Assert.assertEquals(boolresult, expectedResult);
		
		List<WebElement> lists = driver.findElements(By.xpath("//*[@id=\"SubGroupTable\"]/tbody/tr"));
	    int number = lists.size();
	    System.out.println(number);
	    
	    for(WebElement ele : lists)
	    {
	    	String resulttext = ele.getText();
	    	System.out.println(resulttext);
	    	boolean result = resulttext.contains("Steel");
			boolean expectedResult = true;
			
			Assert.assertEquals(result, expectedResult);
	    }
	
	    
	    TakesScreenshot shot = (TakesScreenshot)driver;
	    File srcFile= shot.getScreenshotAs(OutputType.FILE);
	  	    
	    File destFile = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumWebDriver\\Screenshot\\screenshot1.png");
	    
	    FileUtils.copyFile(srcFile, destFile);
	
		
		//*[@id="SubGroupTable"]/tbody/tr[1]/td[3]
		//*[@id="SubGroupTable"]/tbody/tr[5]/td[3]
		
		
		
	  
	  
  }
}
