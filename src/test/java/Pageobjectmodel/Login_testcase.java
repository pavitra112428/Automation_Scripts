package Pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;




public class Login_testcase {
	WebDriver driver;
	@BeforeClass //it will execute only one time 
	void setup()
	{
		 driver =new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	@Test
  void TestLogin()
  {
		demo_objectmodel dop = new demo_objectmodel(driver);
		dop.setUserName("Admin");
		dop.setPassword("admin123");
		dop.clickLogin();
	
		//Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	

  }
	@AfterClass
  void tearDown()
  {
	  driver.quit();
	  //with out using page factory first approach 
  }  
}


