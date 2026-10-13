package Testing.Selenium_Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class DragAndDrop_website {
	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//drag
		WebElement drag=driver.findElement(By.id("angular"));
		Thread.sleep(1000);
		
		
		//drop
 		WebElement drop=driver.findElement(By.id("droparea"));
 		Thread.sleep(1000);
 		
// 		//Action 
// 		Action ac=new Actions(driver);
// 		 ac.dragAndDrop(drag, drop).build().perform();
//		
	}

}
