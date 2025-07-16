package windowHandlesint;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	WebDriver driver;
//  @SuppressWarnings("deprecation")
@Test
  public  void maint ( ) throws Exception {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	  String Parenthandle = driver.getWindowHandle();
	  System.out.println("Parent Handle-" + Parenthandle);
	  driver.findElement(By.id("newWindowBtn")).click();
	 Set<String> Handles =  driver.getWindowHandles();
	 for (String Handle : Handles) {
		 System.out.println(Handles);
		 
		 if (!Handle.equals(Parenthandle)) {
			 
			 driver.switchTo().window(Handle);
			 driver.findElement(By.id("firstName")).sendKeys("Bawa");
			 Thread.sleep(3000);
			 driver.close();
			 
		 }
		 
		 
	 }
	 
	 driver.switchTo().window(Parenthandle);
	 driver.findElement(By.id("name")).sendKeys("Done");
	 driver.quit();
	  
	  
	  
  }
}
