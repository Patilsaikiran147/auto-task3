package Utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import com.google.common.io.Files;

import Base.BaseTest;



public class Suitelistener implements ITestListener,IAnnotationTransformer{
	
   
	public void onTestFailure(ITestResult result) {
	String filename=System.getProperty("user.dir")+File.separator+"Screenshot"+File.separator+result.getMethod().getMethodName();
	TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   try {
		Files.copy(src, new File(filename+".png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
