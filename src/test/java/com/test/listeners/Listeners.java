package com.test.listeners;

import java.io.IOException;

import javax.net.ssl.SSLEngineResult.Status;

import org.com.base.Testbase;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.test.utilities.ExtentReporter;
import com.test.utilities.Takescreenshot;

public class Listeners extends Testbase  implements ITestListener {
	
  public Listeners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

Takescreenshot ts;
 ExtentTest test;
 
 ExtentReports extent;
 
ThreadLocal<ExtentTest> et = new ThreadLocal<ExtentTest>();

	

	@Override
	public void onTestStart(ITestResult result) {
	
		
		System.out.println("Test started");
		ExtentReporter ext =new ExtentReporter();
		extent = ext.extentgenerator();
		
		test = extent.createTest("Start test");
		et.set(test);
		
		

		
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test success");
		
		et.get().info("Test-Succeeded");
		driver.quit();
	
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		String resname = result.getName();
		
		
		System.out.println("Test Failed");
	   System.out.println(resname);
	   System.out.println(result.getThrowable());
	   System.out.println(result.getTestName());
		
         try {
        	
        	 ts= new Takescreenshot();
        	 String ptname = ts.screenCapture(resname);
        	
        	 et.get().addScreenCaptureFromPath(ptname, resname);
        	 driver.quit();
        	 
        	
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("started");
	
	
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("finish");
		extent.flush();

		
		
	}

}
