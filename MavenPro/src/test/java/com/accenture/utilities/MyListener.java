package com.accenture.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener {
	
	ExtentReports extRep;
	ExtentTest extTest;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		extRep.endTest(extTest);
		extRep.flush();
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		extRep = new ExtentReports("C:\\java demo\\MavenPro\\src\\test\\java\\test.html");
		extRep.addSystemInfo("Browser", "Chrome");
		extRep.addSystemInfo("Executed By", "User123");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Failed but within success percentage");
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		extTest.log(LogStatus.FAIL, arg0.getMethod().getMethodName() + " has failed");
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Skipped");
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		extTest = extRep.startTest(arg0.getMethod().getMethodName() + " has started");
		extTest.log(LogStatus.INFO, arg0.getMethod().getMethodName() + " has started");
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		extTest.log(LogStatus.PASS, arg0.getMethod().getMethodName() + " has passed");
	}

}
