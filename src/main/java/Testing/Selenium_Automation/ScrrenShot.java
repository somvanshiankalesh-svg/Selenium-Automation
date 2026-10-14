package Testing.Selenium_Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScrrenShot {
	public static void main (String[]args) throws IOException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
	
		//File src=(File)driver.getScreenshotAs(OutputType.FILE);
		
		
		//TakesScreenShot - Interface
		//getscreenshots -method
		File ts=(File)driver.getScreenshotAs(OutputType.FILE);
		
		//Path of screenshot 
	    File Dest=new File("C:\\Users\\HP\\Automation_Testing\\Selenium_Automation\\ScreenShot\\Myntra.png");
	    
		Files.copy(ts, Dest);
	    System.out.println("screenshot saved successfully:");
	    driver.close();
	} 

}
