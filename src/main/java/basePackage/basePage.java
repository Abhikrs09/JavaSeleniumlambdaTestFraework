package basePackage;

import java.lang.reflect.Method;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtentManager;
import utilities.ReadingPropertiesFile;
import utilities.Screenshot;



public class basePage {
    public static Logger logger = LogManager.getLogger(basePage.class);
    protected  WebDriver driver;
    public static ExtentReports extent_report;
    public static ExtentTest extent_test;

    @SuppressWarnings("deprecation")
    @BeforeMethod
    public void setUp(Method method) {
        String browserName = ReadingPropertiesFile.getProperty("browser");
        String runMode = ReadingPropertiesFile.getProperty("runmode");

        if (browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            if (runMode.equalsIgnoreCase("headless")) {
                options.addArguments("--headless");
            }
            driver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            if (runMode.equalsIgnoreCase("headless")) {
                options.setHeadless(true);
            }
            driver = new FirefoxDriver(options);
        } else if (browserName.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            if (runMode.equalsIgnoreCase("headless")) {
                options.addArguments("--headless");
            }
            driver = new EdgeDriver(options);
        }

        driver.manage().window().maximize();
//        driver.get(ReadingPropertiesFile.getProperty("urlEcom"));
        driver.get(ReadingPropertiesFile.getProperty("url"));
        extent_report = ExtentManager.getInstance("Reports//Extent_demo.html");
        extent_test = extent_report.startTest(method.getName());
    }

    @AfterMethod
    public void testStatus(ITestResult result) {
        int retryCount = result.getAttribute("retryCount") != null ? (int) result.getAttribute("retryCount") : 0;

        if (result.getStatus() == ITestResult.SUCCESS) {
            logger.info("Test case passed");
            //retry
            extent_test.log(LogStatus.PASS, "Test case passed on attempt " + (retryCount + 1));
        } else if (result.getStatus() == ITestResult.FAILURE) {
            Screenshot.takeScreenShot(driver, result.getName());
            extent_test.log(LogStatus.ERROR, extent_test.addScreenCapture(System.getProperty("user.dir") + "\\Screenshots\\" + result.getName() + ".jpg"));
            extent_test.log(LogStatus.ERROR, result.getThrowable());
            extent_test.log(LogStatus.FAIL, "Test case failed after " + (retryCount + 1) + " attempts");
        }

        extent_report.flush();
        driver.quit();
    }




}
