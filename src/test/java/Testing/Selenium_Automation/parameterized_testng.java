package Testing.Selenium_Automation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterized_testng {
	
	@Parameters({"P"})//90
	@Test
	
	public void display_number(int num)
	{
		System.out.println("number is :"+ num);
	}

}
