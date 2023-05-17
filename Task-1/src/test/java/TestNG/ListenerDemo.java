package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public abstract class ListenerDemo implements ITestListener{
	
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"test start");
	}

	

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"test fail");

	}


	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"test on start");

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"test on success");

	}

}
