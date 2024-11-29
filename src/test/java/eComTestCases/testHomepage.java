package eComTestCases;

import PagesMArket.homePage;
import basePackage.basePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.RetryAnalyzer;

public class testHomepage extends basePage {

    public static Logger logger = LogManager.getLogger(testHomepage.class);

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void homePageImageDisplayed() {
        // Initialize the homePage object with the driver
        homePage hp = new homePage(driver);

        // Assert that the home page logo is displayed
        Assert.assertTrue(hp.ishomePageLogoDisplayed(), "Home page logo is not displayed.");

        // Hover over the "My Account" dropdown and click login button
        hp.hoverMyAccountDrop();
        hp.clickLoginBtn();

        // Enter search term and click the search button
        hp.enterInSearchBox();  // Assuming this is defaulting to "mobile" as per your code
        hp.clickSearchBtn();

        // Assert that the Continue button is displayed
        Assert.assertTrue(hp.isDisplayedbtnContinue(), "Continue button is not displayed.");
    }
}
