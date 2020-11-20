package com.test.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentEmailReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	static ExtentHtmlReporter reporter;
	static ExtentReports extent;

	
	public static ExtentReports extentgenerator() {
		String rep = "./Reports/extent-report.html";
		
		reporter =new ExtentHtmlReporter(rep);
		reporter.config().setDocumentTitle("Extentreporter");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Testreport");
		
	
	
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Laptop", "Dell-PC");
		extent.setSystemInfo("OS", "Windows-10 X 64-bit");
		extent.setSystemInfo("Tested-By", "Darshan");
		
		return extent;
	}

}
