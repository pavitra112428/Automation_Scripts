package Day43_testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_BeforeTest_AfterTest {
	@Test
	void abc()
	{
		System.out.println("This is Test");
	}
	@BeforeTest
   void ghf()
   {
	   System.out.println("This is Before Test");
   }	
}



