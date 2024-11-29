package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.handelWindowsPage;
import pages.lambdaHomePage;
import pages.twitterPage;
import utilities.ReadingPropertiesFile;
import utilities.RetryAnalyzer;
import utilities.elementsUtils;


public class testHandelWindowsPage extends basePage {

	public static Logger logger = LogManager.getLogger(testHandelWindowsPage.class);

    private lambdaHomePage lhp;
    private handelWindowsPage hwp;

    private void testSetUp(){
        lhp = new lambdaHomePage(driver);
        hwp = new handelWindowsPage(driver);

    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
	public void handelTwitterPage() throws InterruptedException {
		
		logger.info("----- Verifying the functionality of testSlider -----");
		

		String username = ReadingPropertiesFile.getProperty("xusername");
		String pass = ReadingPropertiesFile.getProperty("xpass");
		
		
		lhp.clickbtnWindowsHandel();
		hwp.clickbtnFollowTwitter();
		
		logger.info("----- Switch to the new Twitter popup window -----");
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        
        logger.info("----- Changing the driver  and maximising the window -----");
        twitterPage tp = new twitterPage(driver);
        driver.manage().window().maximize();
        
        logger.info("----- Perform the Twitter login action -----");
        tp.clickloginbtn();
        tp.settextUsername(username);
        tp.clickbtnNextUsername();
        elementsUtils.scrollDown(driver, 100);
        
        logger.info("----- Verifying the Password field is displayed and enabled or not -----");
        Assert.assertTrue(tp.setTextPasswordIsDisplayed());
        Assert.assertTrue(tp.settxtPasswordisEnabled());
        
        
        logger.info("----- Seting the password  -----");
        tp.settxtPassword(pass);
       // tp.clicktxtsetPassword();
        tp.clickbtnLogin();

        logger.info("----- Verify the title of the Twitter popup -----");
        String twitterPopupTitle = driver.getTitle();
        System.out.println("Twitter Popup Title: " + twitterPopupTitle);

        logger.info("----- Close the Twitter popup -----");
        driver.close();

        logger.info("----- Switch back to the main window -----");
        driver.switchTo().window(driver.getWindowHandles().iterator().next());

        logger.info("----- Verify the title of the main window -----");
        String mainPageTitle1 = driver.getTitle();
        
        logger.info("----- Main Page Title:  -----"+mainPageTitle1);


		
		
	}
	
	
}