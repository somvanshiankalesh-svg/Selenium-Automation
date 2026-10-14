package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_test {
	public static void main(String[]args)
	{
		
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
		
		
		//left slider 
//		WebElement leftslider=driver.findElement(By.xpath("//span[@style='left: 15%;']"));
//		
//		Actions a=new Actions(driver);
//		a.dragAndDropBy(leftslider, 100, 0).build().perform();
//		
		//Rigth Slider 
		WebElement rightslider=driver.findElement(By.xpath("//span[@style='left: 60%;']"));
		
		Actions a=new Actions(driver);
		a.dragAndDropBy(rightslider, -50, 0).build().perform();
		
		
		
		
		
	}

}
