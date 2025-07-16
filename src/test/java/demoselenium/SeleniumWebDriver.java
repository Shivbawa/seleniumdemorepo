package demoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumWebDriver {
  
  public static void main(String [] args) throws InterruptedException {
	  //A blank browser will be open
	  ChromeDriver driver = new ChromeDriver();
	  // provided URL will be open
	  driver.get("https://omayo.blogspot.com/");
	  
	  driver.manage().window().maximize();
	  
	//WebElement Click =   driver.findElement(By.id("confirm"));
	  //System.out.println(Click.getText());
	  
	//  Click.click();
	  

		 String CurrentURL1 = driver.getCurrentUrl();
		 
		 System.out.println(CurrentURL1);
	  
	   WebElement Sendkeys =  driver.findElement(By.name("q"));
	   
	   Sendkeys.sendKeys("Done");
	   
	//  WebElement Clear =  driver.findElement(By.id("textbox1"));
	  
	//  Thread.sleep(5000);
	 // Clear.clear();
	  
	  WebElement Class = driver.findElement(By.className("classone"));
	  Class.sendKeys("Bawa");
	  
	// WebElement Link = driver.findElement(By.linkText("compendiumdev"));
	// Link.click();
	 
	// String CurrentURL2 = driver.getCurrentUrl();
	 
	 //System.out.println(CurrentURL2);
	  
	 // driver.close();
	  
	  
	  
	 // String Title = driver.getTitle();
	  
	 // System.out.println(Title);
	  
	//  driver.findElement(By.linkText("Open a popup window")).click();
	 // driver.findElement(By.linkText("Blogger")).click();
	  
	 // driver.quit();
	  
	 String GetAttribute = driver.findElement(By.id("textbox1")).getAttribute("value");
	 
	 System.out.println(GetAttribute);
	 
	 
	 
	 
  }
}
