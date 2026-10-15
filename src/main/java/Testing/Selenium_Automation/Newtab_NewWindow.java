package Testing.Selenium_Automation;

import org.openqa.selenium.edge.EdgeDriver;

public class Newtab_NewWindow {
	public static void main(String[]args)
	{
		EdgeDriver driver = new  EdgeDriver();
		
		driver.manage().window().maximize();
		

    }
}