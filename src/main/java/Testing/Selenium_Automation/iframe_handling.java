package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_handling {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//1.iFrame 
		//2.Index
		//3.idorname
		//4.webelemnt
		
		//Iframe Index
		//driver.switchTo().frame(0);
		
		//iframe WebElement 
		WebElement iframe=driver.findElement(By.tagName("i frame"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ankalesh");
		
		

	}

}
