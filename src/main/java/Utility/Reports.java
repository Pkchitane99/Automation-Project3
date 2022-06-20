package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public static ExtentReports createStandardReports() {
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("extendReport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Regression", "Zerodha");
        report.setSystemInfo("Browser", "Chrome");
		return report;
		
	}

}
