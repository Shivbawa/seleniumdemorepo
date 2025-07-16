package titanx;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Titanx {
	 ChromeDriver driver;
  @Test
  public void f() {
	  
	 // ChromeOptions options = new ChromeOptions();
     // options.addArguments("--disable-features=AllowInsecureLocalhost"); // Allow insecure localhost if needed
     // options.addArguments("--ignore-certificate-errors"); // Ignore SSL certificate errors

	  
 driver = new ChromeDriver();
	  
	  driver.get("https://titanx.icecostmasters.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
}
