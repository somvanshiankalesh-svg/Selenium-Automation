package Concept_of_Linteners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners()

public class Orange_HRM_Listner {
	
	ChromeDriver driver;
	@Test(priority=0)
	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
	}
	
	@Test(priority=1)
	void verifylaunch() 
	{
		String actual=driver.getCurrentUrl();
		String Expected="https://opensource-demo.orangehrmlive.com/web/index.php/auth/";
		
		Assert.assertEquals(actual, Expected);
		
	}
	
//	@Test(priority=1)
//	void verifylaunch1() 
//	{
//		String actual=driver.getCurrentUrl();
//		String Expected="https://opensource-demo.orangehrmlive.com/web/index.php/auth/";
//		
//		Assert.assertEquals(actual, Expected,"URL not match");  //url jevha match hot nahi tevha assert madhala message print hoto 
//		
//		
//	}
	
	@Test(priority=2)
	void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin12");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String e_url="dashboard.com";
		String a_url=driver.getCurrentUrl();
		Assert.assertEquals(e_url, a_url);
		
	}
	
//	@Test(dependsOnMethods= {"login"})
    @Test(priority=3)
	void logout()
	{
    	driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		System.out.println("Current URl:"+ driver.getCurrentUrl());
	}

}