package Testing.Selenium_Automation;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelector {
	public static void main(String[]args) throws Throwable
	{
		//initialize chromebrowser
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Name')]")).sendKeys( "Ankalesh");
		Thread.sleep(2000); 
		
		
		//1.CssSelector=tagname[attributes='value']
		driver.findElement(By.cssSelector( "input[id='email']")).sendKeys("somvanshiankalesh@gmail.com");
		Thread.sleep(2000); 
		
		//2.CssSelector tagname#idvalue 
		driver.findElement(By.cssSelector("input#phone")).sendKeys("7391915629");
		Thread.sleep(2000);  
		
		//3.CssSelector=tagname
		driver.findElement(By.cssSelector("textarea")).sendKeys("At post wadgaon chhatrapati sambhajinagar");
		
		//4.cssselector=tagname[attribute='value'] [attribute='value']
		driver.findElement(By.cssSelector("input[name='gender'][id='male']")).click();
		
		// handling multiple webelements 
				List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
			   
			   Iterator<WebElement> it =checkboxes.iterator();
			   
			   while(it.hasNext())
			   {
				   WebElement check=it.next(); //sunday monday
				   check.click();//clicked on sunday clicked 
				   Thread.sleep(1000);
				   
			   }
			   
			   
	      //driver.findElement(By.id("country")).click();
	      
	      // Select country
          Select country = new Select(driver.findElement(By.id("country")));

          country.selectByVisibleText("India");
		
		
		
		
		
		
	}

}
