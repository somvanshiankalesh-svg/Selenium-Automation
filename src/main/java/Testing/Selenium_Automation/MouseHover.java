package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[]args)
	{
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement poiuntmebtn=driver.findElement(By.xpath("//button[text()='Point Me'] "));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(poiuntmebtn).build().perform();		
	}

}
