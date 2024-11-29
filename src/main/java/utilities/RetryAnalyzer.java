package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.LogStatus;
import basePackage.basePage;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 2; // Maximum retry attempts

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            // Log retry attempt in ExtentReports
            basePage.extent_test.log(LogStatus.INFO, "Retrying test " + result.getName() + " (Attempt " + retryCount + " of " + maxRetryCount + ")");
            // Store the retry count in the result for later access
            result.setAttribute("retryCount", retryCount);
            return true;
        }
        return false;
    }
}
