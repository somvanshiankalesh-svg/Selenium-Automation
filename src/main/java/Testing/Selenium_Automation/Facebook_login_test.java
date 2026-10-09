package Testing.Selenium_Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_test {
public static void main(String []args) throws Throwable
{
	//initialize chromedriver  
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://secure.facebook.com/login.php/");
		
		//locator name 
		//findout the email textbox
		driver.findElement(By.id("email")).sendKeys("ankalesh@123");
		
		//find the email password 
		driver.findElement(By.id("pass")).sendKeys("8545252t4r432");
		
		//login 
		driver.findElement(By.id("loginbutton")).click();

}
}