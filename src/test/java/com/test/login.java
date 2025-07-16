package com.test;
	

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class login {
//		private String valueA = Xls_Reader.a;
//		private String valueB = Xls_Reader.b;
//		private String valueC = Xls_Reader.c;
//		private String result = Xls_Reader.result;
		
		public static WebDriver driver;
		public static WebDriverWait wait;
		@BeforeTest
		public WebDriver setUp() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.get("http://testing.icecostmasters.in/Account/AutomationTesting");
			Thread.sleep(3000);
			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
			return driver;
		}

//		@Test(priority = 1)
//		public void page() {
//				driver.findElement(By.xpath("//input[@id='inputA']")).sendKeys(valueA);
//				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//				driver.findElement(By.xpath("//input[@id='inputB']")).sendKeys(valueB);
//				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//				driver.findElement(By.xpath("//input[@id='inputC']")).sendKeys(valueC);
//				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//				driver.findElement(By.xpath("//input[@type='button']")).click();
//			}
//		}




}
