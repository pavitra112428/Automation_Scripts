package Day44_testng_dependency_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency_methods_testng {
	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
   @Test(priority=2,dependsOnMethods ={"openapp"})                                                                        
   void login()
   {
	   Assert.assertTrue(true);
   }
   @Test(priority=3,dependsOnMethods={"openapp"})
   void search()
   {
	   Assert.assertTrue(true);
   }
   @Test(priority=4,dependsOnMethods= {"openapp"})
   void addsearch()
   {
	   Assert.assertTrue(true);
   }
   @Test(priority=5,dependsOnMethods= {"openapp"})
   void logout()
   {
	   Assert.assertTrue(true);
   }
   
}
