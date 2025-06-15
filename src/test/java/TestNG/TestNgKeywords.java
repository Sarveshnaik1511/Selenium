package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgKeywords {
	
	// priority means which test to be run at which position ex. priority -1,0,1,2, 
	// here -1th test will run first, then 0th then 1 and 2
	// no priority means by default priority =0, 
	// if priority are same then execution will happen based on alphabetical order
	
	
	@Parameters ({"a", "b", "name"})
	// variable doesnt matter, a will get assigned to c and b will get assigned to d.
	// same with string values, it will get assinged according to the order and we can change the variable inside the method
	@Test (priority =-1)
	public void test1(int c,int d, String name) {
		
		System.out.println("Test 1");
		System.out.println(c+d);
		System.out.println(name);
	}
	
	@Parameters ({"a"})
	@Test (priority =-2)
	public void test2(int a) {
		System.out.println("Test 2");
		System.out.println(a);
	}
	
	// invocationCount means how many time we want to execute the single test
	// ex. invocationCount = 3, now the particular test will execute 3 times
	@Test (priority = 1 , invocationCount = 3)
	public void test3() {
		System.out.println("Test 3");
	}
	
	// enabled = false, we write this when we dont want to execute the particular test
	@Test (enabled =false)
	public void test4() {
		System.out.println("Test 4");
	}
	
	
	// timeOut keyword is used to set the duration in millisecond of the particular test to execute 
	// if the test didn't perform in the specified them, then the test will fail
	@Test (timeOut = 1000)
	public void test5() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test 5");
	}
	
	// dependsOnMethod will be dependent on another method
	// if the dependent method runs, this method will run otherwise not
	@Test (dependsOnMethods = {"test1"}, priority = 0)
	public void test6() {
		System.out.println("Test 6");
	}
	

}
