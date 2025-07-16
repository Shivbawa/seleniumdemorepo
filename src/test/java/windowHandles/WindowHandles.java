package windowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver = new ChromeDriver();	  
	  driver.get("https://www.costmasters.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  String OriganlWindow = driver.getWindowHandle();
	  System.out.println(OriganlWindow);
	  
	  driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/a[3]/i")).click();
	  
	  Set<String> allWindows =  driver.getWindowHandles();
	  
	  for(String handle : allWindows)
	  {
		  System.out.println(handle); 
		  if(!handle.equals(OriganlWindow))
		  {
			  driver.switchTo().window(handle);
			  String newWindowTitle = driver.getTitle();
			  System.out.println(newWindowTitle);
			  driver.close();
		  }
		  
	  }
	  
	  driver.switchTo().window(OriganlWindow);
      String OrgWindowTitle = driver.getTitle();
	  System.out.println(OrgWindowTitle);
	  
	  
  }
}
