//package Testing.Selenium_Automation;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
////import net.bytebuddy.asm.Advice.OffsetMapping.ForThrowable;
//
//public class possitive_login_test {
//	public static void main(String []args) throws Throwable
//	{
//		// initialize chromedirver
//		ChromeDriver driver =new ChromeDriver(); 
//		
//		driver.manage().window().maximize();
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//		
//		//locator name 
//		//find out username 
//		driver.findElement(By.id("usermane")).sendKeys("student");
//		
//		//find out password 
//		driver.findElement(By.id("password")).sendKeys("Password123"); 
//		
//		//login 
//		driver.findElement(By.id("submit")).click();
//		
//		Thread.sleep(2000);
//		
//		 // Print current URL
//        System.out.println("practicetestautomation.com/logged-in-successfully/ " + driver.getCurrentUrl());
//
//        //  Verify URL
//        if (driver.getCurrentUrl().contains("logged-in-successfully")) {
//            System.out.println("Login Successful");
//        } else {
//            System.out.println("Login Failed");
//        }
//
//        // Close browser
//        driver.quit();
//		
//	}
//
//}   

package Testing.Selenium_Automation;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class possitive_login_test {

    public static void main(String[] args) throws InterruptedException {

        // Launch browser
        ChromeDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open login page 
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Enter username
        driver.findElement(By.id("username")).sendKeys("student");
        
        Thread.sleep(2000);

        // Enter password
        driver.findElement(By.name("password")).sendKeys("Password123");
        
        Thread.sleep(2000);

        // Click Submit
        driver.findElement(By.id("submit")).click();

        Thread.sleep(2000);

        // Verify URL
        System.out.println("URl after login:" + driver.getCurrentUrl());
        Thread.sleep(2000);
        
        
        //verify new page contains expected text ("Cogratualations login successfully")
        WebElement greet_text=driver.findElement(By.tagName("strong"));
        System.out.println("Greet text after login:"+greet_text.getText());
        
        
        //verify button log out is displayed on the new page 
        WebElement isLogout=driver.findElement(By.linkText("log Out"));
        System.out.println("logout text:"+isLogout.getText());
        
        // Close browser
        driver.quit();
    }
}




