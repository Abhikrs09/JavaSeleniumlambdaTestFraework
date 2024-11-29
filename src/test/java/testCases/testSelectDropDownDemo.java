package testCases;
import basePackage.basePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dropDownDemoPage;
import pages.lambdaHomePage;
import utilities.ReadingPropertiesFile;
import utilities.RetryAnalyzer;

public class testSelectDropDownDemo extends basePage {

    public static Logger logger = LogManager.getLogger(testiFrameHandelPage.class);

    private lambdaHomePage lhp;
    private dropDownDemoPage dddp;

    private String Days= ReadingPropertiesFile.getProperty("days");
    private Integer index= Integer.parseInt(ReadingPropertiesFile.getProperty("index"));


    public void TestSetUp(){
        lhp = new lambdaHomePage(driver);
        dddp = new dropDownDemoPage(driver);
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void  selectDaysByValue(){

        TestSetUp();
        lhp.clickonBtn_SelectDropDown();
//        dddp.selectSingleDaysFromDDByValue(Days);
        dddp.selectDDSelectByValue_SingleJavaScriptExe(Days);
        String str = dddp.getSelectedSingleDaysFromDD();
        System.out.println(str);
        Assert.assertEquals(Days,str);

    }

    @Test(enabled = false,retryAnalyzer =  RetryAnalyzer.class)
    public void  selectDaysByVisibleText(){

        TestSetUp();
        lhp.clickonBtn_SelectDropDown();
        dddp.selectSingleDaysFromDDByVisibleText(Days);
        String str = dddp.getSelectedSingleDaysFromDD();
        System.out.println(str);
        Assert.assertEquals(Days,str);

    }

    @Test(enabled = false,retryAnalyzer =  RetryAnalyzer.class)
    public void  selectDaysByIndex(){

        TestSetUp();
        lhp.clickonBtn_SelectDropDown();
        dddp.selectSingleDaysFromDDByIndex(index);
        String str = dddp.getSelectedSingleDaysFromDD();
        System.out.println(str);
        Assert.assertEquals(Days,str);

    }


}
