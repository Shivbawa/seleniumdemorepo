package radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckDefaultRadiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testing.icecostmasters.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("shiv@costmasters.in");
		driver.findElement(By.id("Password")).sendKeys("Shiv@123");
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/main/div[1]/div/div/form/div[3]/button")).click();
		WebElement salesRadio = driver.findElement(By.id("flexRadioDefault1"));
		boolean result = salesRadio.isSelected();
		
		if(result == true)
		{
			System.out.println("Selection is okay");
		}
		
		else
		{
			System.out.println("Selection is NOT okay");
		}

	}

}
