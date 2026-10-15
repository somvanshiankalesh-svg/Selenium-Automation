package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dnyaneshwar_portfolio {
	public static void main(String []args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://dnyaneshwar-mule.netlify.app/#");
		
		driver.findElement(By.xpath("//a[@href='#']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='#about']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='#Skills']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='#Projects']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='#education']")).click();
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='#contact']")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
