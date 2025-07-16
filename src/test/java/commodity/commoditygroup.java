package commodity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class commoditygroup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testing.icecostmasters.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
		driver.findElement(By.id("Password")).sendKeys("Shiv@123");
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"sidebar-scroll\"]/div[1]/div[2]/div/div/div/nav/ul/li[2]/a/span")).click();
		driver.findElement(By.linkText("Commodity")).click();
	    WebElement Commoditygroup	=driver.findElement(By.id("commodityDropdown"));
	
	    Select CommoditygroupDropdown = new Select(Commoditygroup);
	
	   CommoditygroupDropdown.selectByVisibleText("Ferrous Metal");
	   
	   Thread.sleep(5000);
	   
	   CommoditygroupDropdown.selectByValue("2084");
	   
	   Thread.sleep(5000);
	   
	   CommoditygroupDropdown.selectByIndex(5);
	   
	   List<WebElement> CommodityList = CommoditygroupDropdown.getOptions();
	   
	   for( WebElement ele : CommodityList)
	   {
		   System.out.println(ele.getText());
	   }
	   
	   
	 //   driver.findElement(By.id("subGroupClassification")).sendKeys("Steel");
	  //  driver.findElement(By.id("SpecificGradeText")).sendKeys("CRCA D 0.5");
	  //  driver.findElement(By.id("groupDensity")).sendKeys("7.85");
	    //driver.findElement(By.xpath("//*[@id=\"tab2Save\"]")).click();
	   
	   
	   //driver.findElement(By.linkText("Commodity Details")).click();
	  //WebElement Commoditygroup2 =  driver.findElement(By.id("commodityDrop"));
	  //Select Commoditygroupselect = new Select(Commoditygroup2);
	  //Commoditygroupselect.selectByVisibleText("Ferrous Metal");
	    

	}

}
