package Testing.Selenium_Automation;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_Demo {
	public static void main(String[]args) throws InterruptedException 
	{
		//initialize webdriver 
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ankalesh");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Somvanshi");
		
		
		// CssSelector=tagname
		driver.findElement(By.cssSelector("textarea")).sendKeys("At post wadgaon chhatrapati sambhajinagar");
		
		//CssSelector=tagname[attributes='value']
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("somvanshiankalesh@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='tel' and @ng-model='Phone']")).sendKeys("7391915629");
		
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkbox1' or @value='cricket']")).click();
		
		//cssSelector=tagname#idvalue 
		driver.findElement(By.cssSelector("input#checkbox3")).click();
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		
		driver.findElement( By.xpath("//a[normalize-space()='English']")).click(); 
		
		//driver.findElement(By.xpath("//option[@value='java']")).click();
		
		// 9. Skills - Select class
        Select skills = new Select(driver.findElement(By.cssSelector("select#Skills")));
        skills.selectByVisibleText("Java");
		
		//Attached file 
		driver.findElement(By.xpath("//input[@type='file' or @id='imagesrc']")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\fortune cloud classes\\Ankalesh_Somvanshi_Res.pdf");
		
		//deth Of Birth year 
		driver.findElement(By.id("yearbox")).sendKeys("2004");
		
		
		
		
		//month 
		driver.findElement(By.id("placeholder")).sendKeys("september");
		
		Select sel=new Select(driver.findElement(By.id("placeholder")));
		sel.selectByVisibleText("september");
		Thread.sleep(1000);
		
		
		
		
		   // 10. Country dropdown
        Select country = new Select(
            driver.findElement(By.cssSelector("select#countries"))
        );
        country.selectByVisibleText("India");

//        // 11. Select Country - searchable dropdown
//        driver.findElement(
//            By.cssSelector("span.select2-selection--single")
//        ).click();
//
//        driver.findElement(
//            By.cssSelector("input.select2-search__field")
//        ).sendKeys("India");
//
//        driver.findElement(
//            By.xpath("//li[contains(@class,'select2-results__option') and normalize-space()='India']")
//        ).click();    
//		

		
		
	}

}









