package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.JqueryDropDownSearchDemoPage;
import pages.lambdaHomePage;
import utilities.ReadingPropertiesFile;
import utilities.RetryAnalyzer;
import utilities.elementsUtils;

public class testDropDownSearchDemoPage  extends basePage{
	
	public static Logger logger = LogManager.getLogger(testDropDownSearchDemoPage.class);

	private lambdaHomePage lhp;
	private JqueryDropDownSearchDemoPage dds;

	private void testSetUp(){

		 lhp = new lambdaHomePage(driver);
		 dds = new JqueryDropDownSearchDemoPage(driver);

	}

	@Test(enabled = false,retryAnalyzer = RetryAnalyzer.class)
	public void SelectFile() {

		logger.info("----- Verifying the SelectFile test -----");

		String files = ReadingPropertiesFile.getProperty("files");

		testSetUp();
		lhp.clickbtnDropDown();

		logger.info("----- Verifying DropDown titile has been displayed or not  -----");
		Assert.assertTrue(dds.isDisplayeddropDownTitle());
		elementsUtils.scrollDown(driver, 500);
		logger.info("----- Select the file  -----");
		dds.selectFromddSelectFile(files);


	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void SelectCountry() {
		
		logger.info("----- Verifying the SelectCountry test -----");

        testSetUp();
        
        logger.info("----- Reading country from properties file -----");
        String country = ReadingPropertiesFile.getProperty("country");
        lhp.clickbtnDropDown();
        dds.clickddSelectCountry();
        dds.selectCountryByName(country);
		dds.selectCountryByName_Action(country);
//		dds.selectCountryByName_javaScriptExe(country);
        logger.info("----- Verifying the input and output country is matching or not -----");
        Assert.assertEquals(country, dds.getCountry());
    
	
		}


	@Test(enabled = false, retryAnalyzer = RetryAnalyzer.class)
	public void SelectState() {

		logger.info("----- Verifying the SelectState test -----");

		testSetUp();

		lhp.clickbtnDropDown();
		dds.clickddSelectState();
		dds.selectStateByName("Alaska");
//		dds.clickddSelectState();
//		dds.selectStateByName("Arkansas");
		System.out.println(dds.getState());

	}
	
	

	

}
