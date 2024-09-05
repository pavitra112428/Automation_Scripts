import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class JioDropdownValues {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the Jio page (replace with actual URL)
            driver.get("https://www.example.com"); // Replace with the actual URL of the Jio page

            // Locate the dropdown element
            WebElement dropdownElement = driver.findElement(By.id("dropdownElementId")); // Replace with the actual ID of the dropdown

            // Initialize Select class
            Select dropdown = new Select(dropdownElement);

            // Get all options from the dropdown
            List<WebElement> options = dropdown.getOptions();

            // Print all options to the console
            for (WebElement option : options) {
                System.out.println(option.getText());
            }

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
