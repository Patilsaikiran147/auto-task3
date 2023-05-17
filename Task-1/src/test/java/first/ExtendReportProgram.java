package first;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportProgram {
	public static void main(String[] args) throws IOException {
		
	ExtentReports er = new ExtentReports();
	File f = new File("report.html");
	ExtentSparkReporter sr = new ExtentSparkReporter("report.html");
	er.attachReporter(sr);
	ExtentTest test1 = er.createTest("test1");
	test1.pass("this is passed");
	ExtentTest test2 = er.createTest("test1");
	test2.log(Status.FAIL,"this failed");
	ExtentTest test3 = er.createTest("test1");
	test3.skip("this skipped");
	er.flush();
	Desktop.getDesktop().browse(new File("report.html").toURI());
}
}
