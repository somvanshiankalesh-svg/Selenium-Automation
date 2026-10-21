package Testing.Selenium_Automation;

import org.testng.annotations.Test;

public class priority_intestNG {
	
	@Test(priority=2)
	public void Launchwebsite()
	{
		System.out.println("fb login page is launched:");
	}
	
	@Test(priority=0)
	public void Credentials()
	{
		System.out.println("Username and password :"); 
	}
	
	@Test(priority=3)
	public void login()
	{
		System.out.println("login the page:");
	}
	
	
}
