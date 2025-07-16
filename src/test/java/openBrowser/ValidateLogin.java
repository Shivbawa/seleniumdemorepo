package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testing.icecostmasters.in/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("Email"));
		userName.sendKeys("shiv@costmasters.in");		
	
		driver.findElement(By.id("Password")).sendKeys("Shiv@123");
		
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
		
		WebElement dashboardLink = driver.findElement(By.xpath("//*[@id=\"sidebar-scroll\"]/div[1]/div[2]/div/div/div/nav/ul/li[1]/a/span"));
		
		boolean isDashboardLink = dashboardLink.isDisplayed();
		
		if(isDashboardLink == true)
		{
			System.out.println("User is Logged in, Dashboard link is there");
		}
		
		else
		{
			System.out.println("User is Not Logged in because Dashboard link is Not there");
		}
		

	}

}
