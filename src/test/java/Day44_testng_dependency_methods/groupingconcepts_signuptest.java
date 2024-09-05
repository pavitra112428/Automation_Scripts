package Day44_testng_dependency_methods;

import org.testng.annotations.Test;

public class groupingconcepts_signuptest {
	
	@Test(priority=1,groups = {"Regression test"})
	void signupbyemail()
	{
		System.out.println("This is sign up email");
	}
   
	
	 @Test(priority=2,groups = {"Regression test"})
	 void signupbyfacebook()
	 {
		System.out.println("This is signup by facebook"); 
	 }
	 @Test(priority=3,groups = {"Regression test"})
	 void signupbytwitter()
	 {
		 System.out.println("This is signup by twiter");
		 
	 }
}

