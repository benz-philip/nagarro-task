package com.nagarro.reporing;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    public static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
    public static ExtentTest extentTest;
    private static ExtentReports extent = ExtentManager.createInstance();

    @Override
    public synchronized void onStart(ITestContext context) {

    }

    @Override
    public synchronized void onFinish(ITestContext context) {
        extent.flush();
    }

    @Override
    public synchronized void onTestStart(ITestResult result) {
        extentTest = extent.createTest(result.getTestContext().getCurrentXmlTest().getName());
        test.set(extentTest);
    }

    @Override
    public synchronized void onTestSuccess(ITestResult result) {
        test.get().pass("Test Passed");
    }

    @Override
    public synchronized void onTestFailure(ITestResult result) {
        test.get().fail("Test Failed");
    }

}