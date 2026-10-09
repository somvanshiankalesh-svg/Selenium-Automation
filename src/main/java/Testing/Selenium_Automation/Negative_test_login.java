package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Negative_test_login {
	public static void main(String[]args) throws Throwable
	{
		//initialize Edgedriver 
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login");
		
		//find username 
		driver.findElement(By.id("Username")).sendKeys("studenta");
		Thread.sleep(1000);
		
		//find password 
		driver.findElement(By.id("Password")).sendKeys("Password123");
		Thread.sleep(1000);
		
		//login 
		driver.findElement(By.id("submit")).sendKeys("click");
		 
		
		String actualURL = driver.getCurrentUrl();
        Thread.sleep(2000);

        if (actualURL.contains("logged-in-successfully")) {
            System.out.println("PASS: URL is correct");
        } else {
            System.out.println("FAIL: URL is incorrect");
        }

		
	}

}


