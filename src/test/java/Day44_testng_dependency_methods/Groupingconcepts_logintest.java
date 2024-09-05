package Day44_testng_dependency_methods;

import org.testng.annotations.Test;

public class Groupingconcepts_logintest {
	@Test(priority=1, groups = {"sanity"})
	void loginbyemail()
	{
		System.out.println("This is login by email");
	}
	@Test(priority=2,groups = {"sanity"})
	void loginbyfacebook()
	{
		System.out.println("This is login by facebook");
		
	}
  @Test(priority=3,groups = {"sanity"})
  void loginbyTwitter()
  {
	  System.out.println("This is login by Twitter");
  }
  
  
}
