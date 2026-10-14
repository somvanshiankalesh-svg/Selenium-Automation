package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_keys {
	public static void main(String[]args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		search.sendKeys("739191629");
		
		//entr 
		search.sendKeys(Keys.ENTER);
		
		//copy paste 
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Firstname.sendKeys("Ankalesh");
		
		//select Firstname 
		Firstname.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(1000);
		
		//copy firstname 
		Firstname.sendKeys(Keys.CONTROL+"C");
		Thread.sleep(1000);
		
		
		WebElement Lastname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		
		
		//paste 
		Firstname.sendKeys(Keys.CONTROL+"V");
		
		
		
		
		
		
	}

}
