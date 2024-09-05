package day42_testng;

import org.testng.annotations.Test;

/*open app
 * login
 * log out
 */

public class Testng_demo{
	@Test (priority=1)
	void openapp(){
		System.out.println("open to the application");	
}
	@Test(priority=2)
	void  login()
	{
		System.out.println("login to the application");
		
	     }
	@Test(priority=3)
	 
	
void logout()
	
	{
		System.out.println("Logout to the application");
		
	    }
	
	
	



	


}