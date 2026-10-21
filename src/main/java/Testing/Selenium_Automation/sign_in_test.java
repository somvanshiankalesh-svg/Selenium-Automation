package Testing.Selenium_Automation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sign_in_test {
	
	ChromeDriver driver; //declare the reference variable of chromedriver
	
	public static void main(String[]args)
	{
		sign_in_test obj=new sign_in_test();
		obj.launch();
		obj.entercredentials();
		obj.enterbtn();
		
	}
		 void launch()
		{
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/SignIn.html");
		}
		
		void entercredentials()
		{
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("somvanshiankalesh@gmail.com");
		    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Ankalesh!233");
		}
		
		void enterbtn()
		{
			driver.findElement(By.id("enterbtn")).click();
		}
		
	

}
