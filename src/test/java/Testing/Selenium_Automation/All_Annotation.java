package Testing.Selenium_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class All_Annotation {
	
	WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("1. Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("2. Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("3. Before Class");
    }

    @BeforeMethod
    public void openBrowser() {
        System.out.println("4. Before Method - Open Browser");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Google Title: " + driver.getTitle());
    }

    @Test
    public void openGitHub() {
        driver.get("https://github.com");
        System.out.println("GitHub Title: " + driver.getTitle());
    }

    @AfterMethod
    public void closeBrowser() {
        System.out.println("5. After Method - Close Browser");

        if (driver != null) {driver.quit();driver = null;
        }
    }

    @AfterClass
    public void afterClass() {
        System.out.println("6. After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("7. After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("8. After Suite");
    }
}
