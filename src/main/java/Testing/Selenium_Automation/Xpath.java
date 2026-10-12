package Testing.Selenium_Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String []args ) throws Throwable
	{
		//initialize chormedriveer 
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/register");
		
		//1.Xpath:"//tagname[@attribute='value']"
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ankalesh");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Somvanshi");
		
		Thread.sleep(1000);
		
		
		//2 By.Xapth://parenttagname/childtagname
		
		 // driver.findElement(By.xpath("//div/input")).sendKeys("Ankalesh@123");
		
		
		
		//3 By.Xpath://tagname[@attiribute='value'and @attributes='value']
		
		driver.findElement(By.xpath("//input[@placeholder='UserName' and @id='userName']" )).sendKeys("Ankalesh@123");
		
		driver.findElement(By.xpath( "//input[@placeholder='Password' and @id='password']")).sendKeys("12344");	
		
		driver.findElement(By.id("register")).click();
		
		
		
		
		
		
	}

}
