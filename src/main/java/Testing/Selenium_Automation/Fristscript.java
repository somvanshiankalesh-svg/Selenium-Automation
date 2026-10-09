package Testing.Selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fristscript {
public static void main(String []args) throws Throwable
{
	//1,set the properties of webdriver
	System.setProperty("webdriver.chrome.driver\", \"...\");","C:\\Users\\HP\\Automation_Testing\\Selenium_Automation\\Driver_resorces\\chromedriver.exe");
	System.out.println("1.Webdriver configuration done!");
	
	//2.Create the object of the chromedriver/initialize chromedirver
	ChromeDriver driver=new ChromeDriver();
	System.out.println("2.initialize chromedriver");
	
	driver.get("https://www.cravitaindia.com/");
	 
	Thread.sleep(2000);
	driver.close(); 
}
}
