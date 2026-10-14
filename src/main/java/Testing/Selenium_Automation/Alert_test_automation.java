package Testing.Selenium_Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_test_automation {
	public static void main(String[]args) throws InterruptedException {
		
		
		//iniotialize the chromebrowser 
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//simple alert
		driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Alert al1=driver.switchTo().alert();
		System.out.println("click the button to display an alert box:"+al1.getText());
		Thread.sleep(1000);
		al1.accept();
		
		//Alert With OK and cancel 
		driver.findElement(By.xpath("//a[@href='Caneltab']"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@oneclick='confirmbox()']"));
		Alert al2=driver.switchTo().alert();
		al2.accept();
		
		
		//Alert with textbox
		driver.findElement(By.id("Textbox")).sendKeys("Ankalesh Somvanshi");
		Alert al6=driver.switchTo().alert();
	    al6.accept();
		
		
	}

}
