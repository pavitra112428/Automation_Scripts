package Day43_testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BeforeTest_AfterTest_demo_Part2 {
	@Test
	void xyz()
	{
		System.out.println("This is Test");
	}@AfterTest()
    void at()
    {
    	System.out.println("This is After test");
    }
}
