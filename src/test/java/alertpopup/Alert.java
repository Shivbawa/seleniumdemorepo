package alertpopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Alert {
	
	ChromeDriver driver;
  @Test
  public void f() throws Exception {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	  Actions act = new Actions(driver);
	  WebElement Alertbox = driver.findElement(By.id("alertBox"));
	  act.moveToElement(Alertbox).click().build().perform();
	  
	 String AlertText = driver.switchTo().alert().getText();
	 System.out.println(AlertText);
	 Thread.sleep(5000);
	 driver.switchTo().alert().accept();
	  

  }
}
