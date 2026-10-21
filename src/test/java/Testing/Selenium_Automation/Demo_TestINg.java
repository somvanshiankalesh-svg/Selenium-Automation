package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_TestINg {
	 static ChromeDriver driver;

	 @Test
void Demolaunch()
{
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/SignIn.html");
}

	 @Test
void entercredentials()
{
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("somvanshiankalesh@gmail.com");
    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Ankalesh!233");
}

	 @Test 
void enterbtn() throws InterruptedException
{
	driver.findElement(By.id("enterbtn")).click();
	Thread.sleep(2000);
	driver.close();
	
}
	



}