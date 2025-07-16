package forgetpassword;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgetpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://testing.icecostmasters.in/");
		Driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
		Driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
	    String ActualResult =	Driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/span")).getText();
		
		//System.out.println(ActualResult);
		
		if(ActualResult.equalsIgnoreCase("The Password field is required."))
		
		{
			
			System.out.println("Correct Warning");
		}

		else
		{
			System.out.println("Incorrect Warning");
		}
	}

}
