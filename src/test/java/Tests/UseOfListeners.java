package Tests;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;

public class UseOfListeners extends BaseTest implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
        System.out.println(result.getName()+"Test Execution Started Successfully");		
	}
   
	public void onTestFailure(ITestResult result) {
	   
	   try {
		ScreenShot.screen(driver,result.getName());
	} catch (IOException e) {
		
		e.printStackTrace();
	}
   }
  
	public void onTestSucess(ITestResult result) {
	   
		System.out.println("The Test name:- "+result.getName()+ " Passed Successfully..");
   }
  
	public void onTestSkipped(ITestResult result) {
	
		System.out.println("The Test "+result.getName()+ " is Skipped..");
   }
}
