package Testng_listners;

import org.testng.ITestContext;
import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_reportmanager implements ITestListener{
	public ExtentSparkReporter SparkReporter;//ui of the report
	public ExtentSparkReporter sparkReporter;//populate common info on the report
	public ExtentTest test;// craeting test cases entries in the report and update status of the test methods
	public void onStart(ITestContext context) {
		sparkReporter =new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myRport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report");//title of the report
		sparkReporter.config().setReportName("Functional Testing");//name of the report
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name","Localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Os","Windows10");
		extent.setSystemInfo("browser","name");
	}
        
	
	    /*sparkReporter.config().setDocumentTitle("Automation report");//title of the report
	     * sparkReporter.config().setDocumentName("Functional testing");/name of the report
	     */
}
/*
2

3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
package com.objectrepository.demo;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class ExtentDemo {
static ExtentTest test;
static ExtentReports report;
@BeforeClass
public static void startTest()
{
report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
test = report.startTest("ExtentDemo");
}
@Test
public void extentReportsDemo()
{
System.setProperty("webdriver.chrome.driver", "D:\\SubmittalExchange_TFS\\QA\\Automation\\3rdparty\\chrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in");
if(driver.getTitle().equals("Google"))
{
test.log(LogStatus.PASS, "Navigated to the specified URL");
}
else
{
test.log(LogStatus.FAIL, "Test Failed");
}
}
@AfterClass
public static void endTest()
{
report.endTest(test);
report.flush();
}
}*/




















