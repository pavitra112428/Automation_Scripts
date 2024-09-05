package Day44_testng_dependency_methods;

import org.testng.annotations.Test;

public class Groupingmethod_paymenttest {
	@Test(priority=1,groups= {"sanity","regression"})
   void paymentinRupees()
   {
	System.out.println("this is payment in rupees")	;
   }
	@Test(priority=2,groups= {" on"})
	void paymentinDollars()
	{
		System.out.println("This is in dollars");
	}
}
