package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 EdgeDriver driver=new EdgeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 //drag
		 WebElement drag=driver.findElement(By.id("draggable"));
		 Thread.sleep(1000);
		 
		 
		 //drop
		 WebElement drop=driver.findElement(By.id("droppable"));
		 
		 //Action
		 Actions ac=new Actions(driver);
		 ac.dragAndDrop(drag, drop).build().perform();
		 
		 
		 
		 
	}

}
