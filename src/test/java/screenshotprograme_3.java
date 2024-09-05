import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;

import day21.file;
import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotprograme_3 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
      //file src =((takescreenshot)driver).getscreenshotas(output type.file);
	}

}
