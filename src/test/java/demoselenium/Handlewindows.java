package demoselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlewindows {
  @Test
  public void f() {
	  
	  //A blank browser will be open
	  ChromeDriver driver = new ChromeDriver();
	  // provided URL will be open
	  driver.get("https://omayo.blogspot.com/");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.linkText("Open a popup window")).click();
	  
	   Set<String> Windowsets = driver.getWindowHandles();
	   
	   Iterator<String> itr = Windowsets.iterator();
	   
	   String mainwindow = itr.next();
	   String childwindow = itr.next();
	   
	   driver.switchTo().window(childwindow);
	   
	   driver.manage().window().maximize();
	   
	   driver.close();
	   
	   driver.switchTo().window(mainwindow);
	   
	   driver.close();
	  
	 
	  
  }
}
