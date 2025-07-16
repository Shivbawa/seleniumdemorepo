package javaconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Java {
	
	ChromeDriver driver;
	static ExtentReports extentreports;
	static ExtentTest extenttest;
	static ExtentSparkReporter htmlreporter;
	
	
  @BeforeTest
  public void Login() {
	  driver = new ChromeDriver();
	  driver.get("http://testing.icecostmasters.in/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
	  driver.findElement(By.id("Password")).sendKeys("Shiv@123");
	  driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[3]/header/div/div[2]/div[2]/div[8]/a")).click();
	  driver.findElement(By.id("searchBox")).sendKeys("11042024");
	  driver.findElement(By.id("btnSearch")).click();
	   
	  
  }
  
  @Test
  public void f() {
	  

  }
}
