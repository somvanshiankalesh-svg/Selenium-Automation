package Testing.Selenium_Automation;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_Demo {
	public static void main(String[]args) 
	{
		//initialize webdriver 
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ankalesh");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Somvanshi");
		
		
		// CssSelector=tagname
		driver.findElement(By.cssSelector("textarea")).sendKeys("At post wadgaon chhatrapati sambhajinagar");
		
		//CssSelector=tagname[attributes='value']
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("somvanshiankalesh@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='tel' and @ng-model='Phone']")).sendKeys("7391915629");
		
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkbox1' or @value='cricket']")).click();
		
		//cssSelector=tagname#idvalue 
		driver.findElement(By.cssSelector("input#checkbox3")).click();
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		
		driver.findElement( By.xpath("//a[normalize-space()='English']")).click(); 
		
		driver.findElement(By.xpath("//option[@value='java']")).click();
		

		
		
	}

}









