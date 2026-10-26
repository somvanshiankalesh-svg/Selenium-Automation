package Concept_of_Linteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listner_Scripts implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("My test scripts is Test start");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("My test scripts is start");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case fail There is bug :"+ result.getName()); //ethe method ch name show hot.
		
		//System.out.println("Test case fail There is bug :"+ result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case pass successfully:");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This method is skipped because login is failed:");
	}
	
	
	
	
}
	
	
	
	
	

	


