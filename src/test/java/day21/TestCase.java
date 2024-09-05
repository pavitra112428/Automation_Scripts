package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Test case
 * launch browser(chrome)
 * open url https://demo.opencart.com/
 * validate title should be "Your store"
 * close browser
 * */

public class TestCase {

	public static void main(String[] args) {

		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// open url https://demo.opencart.com/
		
		driver.get("https://demo.opencart.com");
		// validate title should be "Your Store"
		String title=driver.getTitle();
		
		
		  String act_title = "Your Store"; 
		  
		  if(act_title.equals(title)) {
		  System.out.println("Test Passed");
		  } 
		  else {
		  System.out.println("Test Failed");
		  }
		  
		  
		  
		  
		 
		// 4. closed browser
		// driver.close();
		// driver.quit();

	}

}
