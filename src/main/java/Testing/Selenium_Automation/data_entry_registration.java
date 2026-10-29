package Testing.Selenium_Automation;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class data_entry_registration {
	public static void main(String[]args) throws Throwable
	{
		//initialize webdriver 
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1 By.Xpath //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Enter Name'] ")).sendKeys("Ankalesh Somvanshi");
		
		// By.Xpath //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("somvanshiankalesh@gmail.com");
		
		// By.Xpath //tagname[@attribute='value' and @attribute='value']
	    driver.findElement(By.xpath("//input[@placeholder='Enter Phone' and @id='phone']")).sendKeys("7391915629");
		
		
		
		//2.By.Xpath parenttag/childtagname
		driver.findElement(By.xpath("//div/textarea")).sendKeys("At post wadgaon dist Chhatrapati sambhajinagar");
		
	   // By.Xpath //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@value='male']")).click();
		
		
		// handling multiple webelements 
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
	   
	   Iterator<WebElement> it =checkboxes.iterator();
	   
	   while(it.hasNext())
	   {
		   WebElement check=it.next(); //sunday monday
		   check.click();//clicked on sunday clicked 
		   //Thread.sleep(1000);
		   
	   }
	   
	   //select country
	   driver.findElement(By.id("country")).click();
	   driver.findElement(By.xpath("//*[@id=\"country\"]/option[10]")).click();
	
	   //choice color 
	   driver.findElement(By.xpath("//option[@value='red']")).click();
	   
	   //choose animal
	   driver.findElement(By.xpath("//option[@value='lion']")).click();
	   
	   //DATE peacker 1
	   driver.findElement(By.id("datepicker")).sendKeys("23/10/2026");
	   
	   //datepicker 2
	   driver.findElement(By.id("txtDate")).click();
	  // driver.findElement(By.xpath("//option[@value='9']")).click();
		
	   // Select Month
       WebElement monthDropdown =driver.findElement(By.className("ui-datepicker-month"));

       Select month = new Select(monthDropdown);
       month.selectByVisibleText("Oct");

       // Select Year
       WebElement yearDropdown =driver.findElement(By.className("ui-datepicker-year"));

       Select year = new Select(yearDropdown);
       year.selectByVisibleText("2026");

       // Select Date 23
       driver.findElement(By.xpath("//a[text()='23']")).click(); 

       // Print selected date
      // String selectedDate =driver.findElement(By.id("txtDate")).getAttribute("value");

     // System.out.println("Selected Date: " + selectedDate);
       
       //datepicker 3
       //first date 
       driver.findElement(By.id("start-date")).sendKeys("23-10-2026");
       
       //last date 
       driver.findElement(By.id("end-date")).sendKeys("30-10-2026");
       
       //submit button 
       driver.findElement(By.xpath("//button[text()='Submit']")).click();
       
       //home Link
       //driver.findElement(By.xpath("//a[text()='Home']")).click();
       
//       //post Atom 
//       driver.findElement(By.xpath("//a[text()='Posts (Atom)']")).click();
       
//       //navigate webapp
//     	driver.navigate().to("https://testautomationpractice.blogspot.com/");
//   	    Thread.sleep(2000);
       
       
       
       //choose Single file 
       driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\Camera Roll 1\\IMG_20230930_212647.jpg");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       
       //Choose Multiple Files 
       driver.findElement(By.id("multipleFilesInput")).sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\My_Profile_Photo.png\n"+"C:\\Users\\HP\\OneDrive\\Pictures\\Camera Roll 1\\1000032847.jpg");
       driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
       
       //Chekbox
       List<WebElement> check=driver.findElements(By.xpath("//table[@id='productTable']//input[@type='checkbox']"));
       
      // for(int i=0;)
       
       
       
	}

	
		
	}


