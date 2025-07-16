package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
	ChromeDriver driver;
  @Test
  public void checkDragDrop() throws InterruptedException {
	  driver = new ChromeDriver();	  
	  driver.get("https://jqueryui.com/slider/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.switchTo().frame(0);
	 
	  Thread.sleep(3000);
	  
	  WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	  
	  Actions action = new Actions(driver);
	  action.dragAndDropBy(slider, 100, 0).build().perform();
	  
	  driver.switchTo().defaultContent();
	  system.out.println("Lrishi commited");
	  
	  driver.findElement(By.linkText("Development")).click();
  }
}
