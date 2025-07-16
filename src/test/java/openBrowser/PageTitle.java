package openBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://testing.icecostmasters.in/");
			
			driver.manage().window().maximize();
			
			String ActualPageTitle = driver.getTitle();
			
			System.out.println(ActualPageTitle);
			
			String ExpectedPageTitle = "Costmasters-Sign In";
			
			if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
			{
				System.out.println("Page Title is correct");
			}
			
			else
			{
				System.out.println("Page Title is NOT correct");
			}
			
			

	}

}
