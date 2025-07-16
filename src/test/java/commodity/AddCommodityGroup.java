package commodity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddCommodityGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testing.icecostmasters.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
		driver.findElement(By.id("Password")).sendKeys("Shiv@123");
		driver.findElement(By.xpath("//*[@id='page-top']/div/main/div[1]/div/div/form/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id='sidebar-scroll']/div[1]/div[2]/div/div/div/nav/ul/li[2]/a/span")).click();
        driver.findElement(By.linkText("Commodity")).click();
       WebElement ComGroupDrop =  driver.findElement(By.id("commodityDropdown"));
       
        Select ComGroupDropDown = new Select(ComGroupDrop);
        
        ComGroupDropDown.selectByVisibleText("Ajai-Aug-Test-Plastic Injection Molding");
       
       
	}

}
