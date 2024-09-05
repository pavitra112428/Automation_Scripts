package Day43_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_assertions {
   
	
	 @Test
	 void xyz()
	 {
		 Assert.assertEquals("xyzu", "xyz");
		 Assert.assertNotEquals(123,123);   //failed
		 Assert.assertNotEquals(123,143);    //passed
		 
		 Assert.assertTrue(true); //passed
		 Assert.assertTrue(false); //failed
		 
		 Assert.assertTrue(1==2);//failed
		 Assert.assertTrue(1==1); //passed this experssion belongs to the ==relational operation true 
		 
		 Assert.assertFalse(1==2);//passed
		 Assert.assertFalse(1==1);//failed
		 
		 //intentionally need to failed the test cases then we can use this one 
		 Assert.fail();
		 //these are all hard assertons these are static methods 
	 } 
	 
}
