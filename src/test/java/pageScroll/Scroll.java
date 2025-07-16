package pageScroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
	ChromeDriver driver;
  @Test
  public void checkScroll() {
	  
	  driver = new ChromeDriver();	  
	  driver.get("https://jqueryui.com/slider/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  //scroll by pixels
	  //js.executeScript("window.scrollBy(0,500)");
	  
	  //Scroll to bottom
	 // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  
	  //Find element by link text and store in variable "Element"        		
      WebElement Element = driver.findElement(By.linkText("API documentation"));

      //This will scroll the page till the element is found		
      js.executeScript("arguments[0].scrollIntoView();", Element);
	  
	  
	  
	  
	  
  }
}
