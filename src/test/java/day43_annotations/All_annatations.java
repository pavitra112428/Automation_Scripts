package day43_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_annatations {
	
	@BeforeSuite
	void xyz()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	void abc()
	{
		System.out.println("After suite");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	void at()
	{
		System.out.println("AfterTest");
		
	}
	@BeforeClass
	void bc()
	{
		System.out.println("BeforeClass");
	}
	     @AfterClass
		void ac()
		{
			System.out.println("AfterClass");
		}
	     @BeforeMethod
	    void bm()
	{
		System.out.println("BeforeMethod");
	}
	     @AfterMethod
	     void am ()
	     {
	    	 System.out.println("AfterMethod");
	     }
	     @Test(priority=1)
	     void tp1()
	     {
	    	 System.out.println("Test priority1");
	     }
	     @Test (priority=2)
	     void tp2()
	     {
	    	 System.out.println("Test priority2");
	     }
	     
}




