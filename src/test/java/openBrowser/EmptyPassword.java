package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testing.icecostmasters.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
		//driver.findElement(By.id("Password")).sendKeys("Shiv@123");
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
				
        String ActualpassText = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/span")).getText();
		
		System.out.println(ActualpassText);
		
		if(ActualpassText.equalsIgnoreCase("The Password field is mandatory."))
		{
			System.out.println("Validation is correct");
		}
		else
		{
			System.out.println("Validation is NOT correct");
		}

	}

}
