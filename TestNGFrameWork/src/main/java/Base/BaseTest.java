package Base;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extentReports;
	public ExtentTest logger;
	public static WebDriver driver;

	@BeforeSuite
	public void beforetest() {
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+File.separator+"Reports"+File.separator+"SAIReports.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter);
		sparkReporter.config().setTheme(Theme.DARK);
	}
	
	@Parameters("browser")
	@BeforeTest
	public void beforemethod(String browser, Method testmethod) {
		logger = extentReports.createTest(testmethod.getName());
		setUpDriver(browser);
		driver.manage().window().maximize();
		driver.get(Constants.url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void setUpDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	@AfterTest
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "-TestCase Failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + "-TestCase Failed", ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + "-TestCase Skipped", ExtentColor.ORANGE));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "-TestCase Passed", ExtentColor.GREEN));
		}
		driver.quit();
	}

	@AfterSuite
	public void afterTest() {
		extentReports.flush();
	}
}
