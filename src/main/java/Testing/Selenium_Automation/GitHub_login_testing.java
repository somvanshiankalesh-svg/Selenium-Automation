package Testing.Selenium_Automation;
import java.awt.event.WindowStateListener;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class GitHub_login_testing {
public static void main(String[]args)  throws Throwable
{ 
	//initalize chromedriver 
	EdgeDriver driver=new EdgeDriver();
	
	
	driver.manage().window().maximize();
	driver.get("https://github.com/");
	
	
	//locator name is id 
	//find out email textbox
	driver.findElement(By.id("hero_user_email")).sendKeys("somvansiankalesh@gmail.com");
	
	//Password 
    driver.findElement(By.id(""))
	
		
} 
	
}
