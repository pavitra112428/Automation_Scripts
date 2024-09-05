package Day41_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*login = @BeforeCLss
 * search =@Test
 * adv search= @Test
 * log out =@AfterClass
 */
 // in this search and adv search are main test so take it has ...> Test Annotation
// before doing search and adv search need to do login som i do for login BeforeClass...>annatotation
//so login after search and adv search will be next performace add to do log out so i add ...>AfterClass for log out 



public class Testng_BeforeClass_AfterClass {
	
	@BeforeClass
	void login()

	{
		System.out.println("This is a login");
		
	}
	@Test
	void search()
	{
		System.out.println("This is a search");
		
	}
	@Test
	void advsearch()
	{
		System.out.println("This is a void search");
		
	}
	@AfterClass
    void logout()
    {
    	System.out.println("This is a logout");
    }
}
