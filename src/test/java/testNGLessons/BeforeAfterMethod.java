package testNGLessons;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeAfterMethod {
  @Test
  public void testMethod() {
	  
	  System.out.println("I am in Test Method");
  }
  
  @Test
  public void testMethod2() {
	  
	  System.out.println("I am in Test Method2");
  }
  
  @Test
  public void testMethod3() {
	  
	  System.out.println("I am in Test Method3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am in Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in After Method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am in Before Test Method");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("I am in After Test Method");
  }

}
