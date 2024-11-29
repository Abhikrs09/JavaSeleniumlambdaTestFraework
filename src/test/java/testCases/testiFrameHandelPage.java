package testCases;

import basePackage.basePage;
import eComTestCases.testLoginpage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.iFramePage;
import pages.lambdaHomePage;
import utilities.RetryAnalyzer;

public class testiFrameHandelPage extends basePage {
    public static Logger logger = LogManager.getLogger(testiFrameHandelPage.class);

    private lambdaHomePage lhp;
    private iFramePage ifp;

    private void testSetUp(){
         ifp = new iFramePage(driver);
         lhp = new lambdaHomePage(driver);

    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public  void EnterTextInNotePadarea(){

        testSetUp();
        lhp.clickbtniFrameDemo();
        logger.info("Clicked Iframe Button From HomePage");

        ifp.SwitchToNotepadiFrame();
        logger.info("Switched to the Notpad iFrame");
        boolean ans3 = ifp.NotepadAreaisDisplayed();

        Assert.assertTrue(ans3);
        ifp.WriteInNotepadArea();
        String str = ifp.GetTextFromNotepadArea();
        logger.info(str);

        boolean ans1 = ifp.NotepadAreaisEnabled();
        boolean ans2 = ifp.NotepadAreaisDisplayed();
        Assert.assertTrue(ans1);
        logger.info("Assertion Got Passed");
        Assert.assertTrue(ans2);
        ifp.SwitchToDefaultFrame();
    }


    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void handelLambdaPageFrame(){

        testSetUp();
        lhp.clickbtniFrameDemo();
        logger.info("Clicked Iframe Button From HomePage");
        ifp.isVisibleSeliFrame2();
        boolean ans3= ifp.isVisibleSelTestHead();
        Assert.assertTrue(ans3);
        logger.info(ans3);
        ifp.SwitchTolambdaPageFrame();
        ifp.ScrollBy100px();
        boolean ans1= ifp.isVisibleSelTestHead();
        Assert.assertTrue(ans1);
        logger.info(ans1);
        driver.navigate().back();
        boolean  ans2 = ifp.isVisiblelambdaPageFrameSeleTestBtn();
        Assert.assertTrue(ans2);
        logger.info(ans2);


    }


}
