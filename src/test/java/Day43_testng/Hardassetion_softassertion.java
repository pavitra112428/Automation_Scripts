package Day43_testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hardassetion_softassertion {
	//@Test
	void hardAssertion ()
	{
		System.out.println("Testing");
		System.out.println("Testing");
		
		//Assert.assertEquals("xyz", "xyz");//passed 
		Assert.assertEquals("XYZ", "xyz"); //failed
		
		System.out.println("Testing");
		System.out.println("Testing");
	}

	@Test
	void softAssertion ()
	{
		System.out.println("Testing");
		System.out.println("Testing");
		
		
		SoftAssert sa = new SoftAssert();
		
		//Assert.assertEquals("xyz", "xyz");//passed ha6rdassertion 
		sa.assertEquals("XYZ", "XYZ"); //

		
		System.out.println("Testing");
		System.out.println("Testing");
		// soft assert class its not static thats why we created variable called "sa"
		sa.assertAll();//Mandatory bcz soft assertion always passed by default to over come that issue used sa.assertall
	}
	
	
}
//if assertion will failed ,under the assertion statement will be failed ,but top of the statement will be passed 
