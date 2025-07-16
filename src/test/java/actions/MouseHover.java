package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	static ChromeDriver driver;
  @Test
  public static void mainyt() {
	  
      driver = new ChromeDriver();	  
	  driver.get("https://naveenautomationlabs.com/opencart/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.linkText("Desktops"))).build().perform();
	  driver.findElement(By.linkText("Mac (1)")).click();
  }
}
