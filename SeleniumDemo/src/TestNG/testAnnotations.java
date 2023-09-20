package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testAnnotations {
	
  @Test
  public void firstTestCase() {
	  System.out.println("Executing.....firstTestCase");
  }
  @Test
  public void secondTestCase() {
	  System.out.println("Executing.....secondTestCase");
  }
  @Test
  public void thirdTestCase() {
	  System.out.println("Executing.....thirdTestCase");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("inside - beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("inside - afterMethod");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("inside - beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("inside - afterTest");
  }

}
