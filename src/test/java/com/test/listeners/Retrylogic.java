package com.test.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrylogic implements IRetryAnalyzer {
	int count;
	int retryMax =2;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count<retryMax) {
			count++;
			return true;
		}
		return false;
	}

}
