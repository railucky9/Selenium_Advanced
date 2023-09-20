package TestNG;

import org.testng.annotations.Test;

public class testExecution {

	@Test (enabled=false)
	public void firstTestCase() {
		System.out.println("Executing....firstTestCase");
	}

	@Test (priority = 3)
	public void secondTestCase() {
		System.out.println("Executing....secondTestCase");
	}

	@Test (priority = 2)
	public void thirdTestCase() {
		System.out.println("Executing....thirdTestCase");
	}

	@Test (priority = 1)
	public void fourthTestCase() {
		System.out.println("Executing....fourthTestCase");
	}
}