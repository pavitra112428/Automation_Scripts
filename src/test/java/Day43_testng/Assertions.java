package Day43_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	@Test
	void testtile()
	{
		String exp_title = "open cart1";
		String act_title ="open cart";
		
		if(exp_title.equals(act_title))
		{
			System.out.println("test failed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
			
		
		
	}

}
