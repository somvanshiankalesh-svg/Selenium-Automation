package Testing.Selenium_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class oranage_HRM_DemoWeb {
	public static void main(String []args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//static wait apply to the whole website 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(1000);
		
		//explicit wait 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
				
		WebElement loginbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
		loginbtn.click();
				
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
	}

}
