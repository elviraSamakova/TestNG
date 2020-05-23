package com.class02;



	/**
	 * Create a class TaskOne that has 5 test methods named:
	firstMethod
	firstMethod1
	secondMethod
	thirdMethod
	fourthMethod
	
	And each of them printing the method name
	Run and observe results
	Then, add the needed attributes to print the following result:
	fourthMethod
	thirdMethod
	secondMethod
	firstMethod
	 */
	
	import org.testng.annotations.Test;
	public class Task1 {
		
		@Test(priority = 4)
		public void firstMethod() {
			System.out.println("first Method");
		}
		@Test(enabled=false)
		public void firstMethod1() {
			System.out.println("first Method1");
		}
		@Test(priority = 3)
		public void secondMethod() {
			System.out.println("second Method");
		}
		@Test(priority = 2)
		public void thirdMethod() {
			System.out.println("third method");
		}
		@Test(priority = 1)
		public void fourthMethod() {
			System.out.println("fourth method");
		}
	}
	
