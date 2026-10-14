package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task_Blazedemo {
	public static void main(String[]args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:blazedemo.com/");
		 WebElement country = driver.findElement(By.xpath("//select[@name='fromPort']"));
		 Thread.sleep(1000);
		 country.selectByVisibleText("paris");
		
	}
	

}
