package Testing.Selenium_Automation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class External_fileread {
	@Test
	void filereadtest() throws IOException 
	{
		//used foe file reading 
		FileReader fr=new FileReader("C:\\Users\\HP\\Automation_Testing\\Selenium_Automation\\test-output\\base.properties");
		
		//used to load file for properties reading 
		Properties pr=new Properties();
		pr.load(fr);
		
		EdgeDriver driver=new EdgeDriver();
		driver.get(pr.getProperty("cravita"));
		driver.close();
		
	}

}
