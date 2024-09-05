package Testng_listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Orange_Hrm implements ITestListener {
	 
	public  void onTestStart(ITestResult result) {
		    System.out.println("test started..");
		  }
	public  void onTestSuccess(ITestResult result) {
		 System.out.println("test passed.");
		  }
	public void onTestFailure(ITestResult result) {
		
		    // not implemented
		  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("test Skipped.");
		  }
	public void onFinish(ITestContext context) {
		System.out.println("test finish.."); // all these get from open declartion take these on open declaration then need to change default to public
		  }
	public void onStart(ITestContext context) {
	    System.out.println("Test execution is started");
	  }
}
