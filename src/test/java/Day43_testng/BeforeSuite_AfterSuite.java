package Day43_testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeSuite_AfterSuite {
	@Test
	void abc()
	{
	System.out.println("This is a Test");
	}
	@AfterSuite
    void xyz()
    {
    	System.out.println("This is a After suite");
    }
	@BeforeSuite
    void mnp()
    {
    	System.out.println("This is before suite");
    }
}
