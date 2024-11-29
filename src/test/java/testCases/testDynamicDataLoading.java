package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.dynamicDataLoading;
import pages.lambdaHomePage;
import utilities.RetryAnalyzer;

public class testDynamicDataLoading extends basePage{

	
	public static Logger logger = LogManager.getLogger(testDynamicDataLoading.class);

	private lambdaHomePage lhp;
	private dynamicDataLoading ddl;

	private void testSetUp(){

		 lhp = new lambdaHomePage(driver);
		 ddl = new dynamicDataLoading(driver);


	}


	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void DataIsLoaded() {
		
		testSetUp();
		lhp.clickbtnDynamicDataLoading();
		Assert.assertTrue(ddl.isTitleDisplayed());
		ddl.clickbtnGetRandomData();
		Assert.assertTrue(ddl.isImageDisplayed());
	}
	
}
