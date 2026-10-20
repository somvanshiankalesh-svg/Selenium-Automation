package Testing.Selenium_Automation;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class annotation {
	
	@AfterTest
	public void name() 
	{
		System.out.println("Ankalesh");
	}
	
	@BeforeTest
	public void surname()
	{
		System.out.println("Somvanshi");
	}
	
	@Test
	public void email()
	{
		System.out.println("somvanshianalesh@gmail.com");
	}
	

}
