package Testing.Selenium_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Task_Blazedemo {
	public static void main(String[]args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:blazedemo.com/");
		
		
		 Select  country =new Select  (driver.findElement(By.xpath("//select[@name='fromPort']")));
		 Thread.sleep(1000);
	     country.selectByVisibleText("Boston");
	     
	     
	     Select country2=new Select (driver.findElement(By.xpath("//select[@name='toPort']")));
	     Thread.sleep(1000);
	     country2.selectByVisibleText("New York");
	     
	     
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     
	     // Count all Choose This Flight buttons
	        List<WebElement> flights = driver.findElements(By.cssSelector("input[type='submit']"));
	        Thread.sleep(1000);
	        
	        System.out.println("Total flights: " + flights.size());
	        
	        Thread.sleep(1000);

	        // Select flight number 9696
	        driver.findElement(By.xpath("//tr[td[normalize-space()='9696']]//input[@type='submit']")).click();
	        Thread.sleep(1000);

	        System.out.println("Selected flight number 9696");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.cssSelector("input[placeholder='First Last']")).sendKeys("Ankalesh Somvanshi");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.cssSelector("input[name='address']")).sendKeys("At Akurdi Pune");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("pune");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Maharashtra");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("zipCode")).sendKeys("431150");
	        Thread.sleep(1000);
	        
	        Select card=new Select (driver.findElement(By.id("cardType")));
	       card.selectByVisibleText("American Express");
	       Thread.sleep(1000);
	       
	       driver.findElement(By.xpath("//input[@name='creditCardNumber']")).sendKeys("2233093324");
	       Thread.sleep(1000);
	        
	       driver.findElement(By.id("creditCardMonth"));
	       Thread.sleep(1000);
	       
	       driver.findElement(By.id("nameOnCard")).sendKeys("Ankalesh Somvanshi");
	       Thread.sleep(1000);
	       
	       driver.findElement(By.id("rememberMe")).click();
	       Thread.sleep(1000);
	       
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       
	       
	       
	        
	        
	        
		
	}
	

}
