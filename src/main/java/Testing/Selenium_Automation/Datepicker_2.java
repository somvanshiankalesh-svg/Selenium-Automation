package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker_2 {
	public static void main(String[]args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//datepicker
		driver.findElement(By.id("txtDate")).click();
		
		//select month 
	    WebElement monthDropdown=driver.findElement(By.className("ui-datepicker-month"));
	    
	    Select month= new Select(monthDropdown);
	    month.selectByVisibleText("Oct");
	    
	    //Select Year
	    //WebElement yearDropdown=driver.findElement(null)
		
	}

}
