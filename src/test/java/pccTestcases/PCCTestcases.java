package pccTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PCCTestcases {
	
	ChromeDriver driver;
	private WebDriverWait wait;
	
  @Test 
  public void login() throws InterruptedException {
	  
	  driver = new ChromeDriver();
	  driver.get("http://testing.icecostmasters.in/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
	  driver.findElement(By.id("Password")).sendKeys("Shiv@123");
	  driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/a")).click();
	  
	 String Actualresult = driver.getTitle();
	 String Expectedresult = "Costmasters";
	 
	 Assert.assertEquals(Actualresult, Expectedresult);
	  
	 driver.findElement(By.linkText("Price Approvals")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.linkText("PCC")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.linkText("PCC Change Impact")).click();
	 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 String[] companyOptions = {"TATA-Delhi"};
	 SelectMultipleDropdown("Company", companyOptions);
	  
  }
  
  public void SelectMultipleDropdown(String dropDown, String[] options) throws InterruptedException {
	  
	  String dropdown1 = "(//label[text()='value']/../following-sibling::div//div/button)[1] | (//span[text()='value']/.. /../following-sibling::div//div/button)[1]";
	  
	  WebElement companyDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dropdown1.replaceAll("value", dropDown))));
	     companyDropdown.click();
	     Thread.sleep(5000);

		for (String option :options)
		{
			String optionXpath="(//button[@title='value']//input)[1]";
			  WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(optionXpath.replaceAll("value", option))));
			     checkbox.click();
			     optionXpath=optionXpath.replaceAll(option, "value");
		}
	   
  }
  
}
