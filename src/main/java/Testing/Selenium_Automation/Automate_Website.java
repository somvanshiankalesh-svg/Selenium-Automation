package Testing.Selenium_Automation;
import org.openqa.selenium.chrome.ChromeDriver;


public class Automate_Website {
public static void main(String []args) throws InterruptedException {
	
	//initialize chromedriver 
	ChromeDriver driver=new ChromeDriver();
	
	//Maximize browser 
	driver.manage().window().maximize();
	
	
	//launch sppu
	driver.get("https://sppu.digitaluniversity.ac/");
	Thread.sleep(2000);
	
	//navigate webapp
	driver.navigate().to("https://www.fortunecloudindia.com/");
	Thread.sleep(2000);
	
	//navigate back 
	driver.navigate().back();
	Thread.sleep(2000);
	
	//navigate forword 
	driver.navigate().forward(); 
	Thread.sleep(2000);
	
	//refresh page 
	driver.navigate().refresh();
	
}

}
