package Testing.Selenium_Automation;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrrenShot {
	public static void main(String[]args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.myntra.com/");
	
		File src=(File)driver.getScreenshotAs(OutputType.FILE);
		
		
		//Path of screenshot 
	    File Dest=new File("C:\\Users\\HP\\Automation_Testing\\Selenium_Automation\\ScreenShot\\Myntra.png");
		
	}

}
