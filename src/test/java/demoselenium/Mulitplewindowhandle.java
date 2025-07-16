package demoselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mulitplewindowhandle {
  @Test
  public void f() {
	  
	  //A blank browser will be open
	  ChromeDriver driver = new ChromeDriver();
	  // provided URL will be open
	  driver.get("https://omayo.blogspot.com/");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.linkText("Open a popup window")).click();
	  
	  driver.findElement(By.linkText("Blogger")).click();
	  
	   Set<String> Windowsets = driver.getWindowHandles();
	   
	   Iterator<String> itr = Windowsets.iterator();
	   
	   
	  
	  while (itr.hasNext()) {
		  
		  String Windowid = itr.next();
		  
		  driver.switchTo().window(Windowid);
		  
		  if(driver.getTitle().equals("New Window")) {
			  
			  driver.manage().window().maximize();
			  
		  }
		  
		  
		  
		  
	  }
	  
	  
	
	  
	  
	  
	  
	  
  }
}


