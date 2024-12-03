package testCases;

import basePackage.basePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.lambdaHomePage;

public class test_disAppearElement extends basePage {

    public static Logger logger = LogManager.getLogger(testCheckboxPage.class);

    private lambdaHomePage lhp;

    private void testSetUp(){
        lhp = new lambdaHomePage(driver);
    }


    @Test()
    public  void testDisappearing(){
        testSetUp();
        String predicted = "Cross Browser Testing On Desktop & Mobile";
        lhp.hoverPlatformBtn();
        lhp.clickbtnDisapperOnline_Browser_Testing();
        String str =lhp.getDisappearPageHeading();
        Assert.assertEquals(predicted,str);


    }



}
