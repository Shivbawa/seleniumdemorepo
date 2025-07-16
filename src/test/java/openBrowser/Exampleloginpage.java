package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampleloginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver Driver = new ChromeDriver();
				Driver.get("http://testing.icecostmasters.in");
				Driver.manage().window().maximize();
				Driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
				Driver.findElement(By.id("Password")).sendKeys("Shiv@123");
				Driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
				

	}

}
