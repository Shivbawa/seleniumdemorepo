package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testing.icecostmasters.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
		//driver.findElement(By.id("Password")).sendKeys("Shiv@123");
		//driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"forgetpass\"]")).click();
		driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
		
   String passText = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/span")).getText();
		
		System.out.println(passText);
		
	}

}
