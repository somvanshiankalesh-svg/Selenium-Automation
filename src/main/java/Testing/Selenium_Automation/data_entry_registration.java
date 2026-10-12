package Testing.Selenium_Automation;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class data_entry_registration {
	public static void main(String[]args) throws Throwable
	{
		//initialize webdriver 
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1 By.Xpath //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Enter Name'] ")).sendKeys("Ankalesh Somvanshi");
		
		// By.Xpath //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("somvanshiankalesh@gmail.com");
		
		// By.Xpath //tagname[@attribute='value' and @attribute='value']
	    driver.findElement(By.xpath("//input[@placeholder='Enter Phone' and @id='phone']")).sendKeys("7391915629");
		
		
		
		//2.By.Xpath parenttag/childtagname
		driver.findElement(By.xpath("//div/textarea")).sendKeys("At post wadgaon dist Chhatrapati sambhajinagar");
		
	   // By.Xpath //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[text='Gender:']")).click();
		
		
		// handling multiple webelements 
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
	   
	   Iterator<WebElement> it =checkboxes.iterator();
	   
	   while(it.hasNext())
	   {
		   WebElement check=it.next(); //sunday monday
		   check.click();//clicked on sunday clicked 
		   Thread.sleep(1000);
		   
	   }
	   
	   
	   driver.findElement(By.id("country")).click();
	
	   //choice color 
	   driver.findElement(By.xpath("//option[@='Red']")).click();
	   
	   
		
		
	}

	
		
	}


