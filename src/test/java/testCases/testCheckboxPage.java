package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.checkBoxPage;
import pages.lambdaHomePage;
import utilities.RetryAnalyzer;


public class testCheckboxPage extends basePage {

public static Logger logger = LogManager.getLogger(testCheckboxPage.class);

	private  lambdaHomePage lhp;
	private checkBoxPage  cbp;

	private void testSetUp(){

		 lhp = new lambdaHomePage(driver);
		  cbp = new checkBoxPage(driver);

	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void SingleCheckBoxDemo() {


		testSetUp();
		logger.info("----- Verifying the functionality of SingleCheckBoxDemo -----");
		
		lhp.clickOnBtnChechbox();
		logger.info("----- Checking the tilte of Checkbox page is displayed or not -----");
		Assert.assertTrue(cbp.isCheckboxTitleDisplayed());
		logger.info("----- Checking the tilte of Checkbox is displayed or not -----");
		cbp.clicksingleCheckbtn();
		Assert.assertTrue(cbp.isOutputClicksingleCheckbtnDisplayed());
		
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void DisableCheckBoxDemo() {
		
		logger.info("----- Verifying the functionality of DisableCheckBoxDemo -----");


		testSetUp();
		
		logger.info("----- Following all the steps to go to the checkbox page -----");
		lhp.clickOnBtnChechbox();
		cbp.clickdisCheckopt1();
		cbp.clickdisCheckopt2();
		
		
		logger.info("----- Checking the title of Checkbox_button_1 is Enabled  or not -----");
		Assert.assertTrue(cbp.isdisCheckopt1Enabled());
		
		logger.info("----- Checking the title of Checkbox_button_3 is Enabled or not -----");
		Assert.assertTrue(cbp.isdisCheckopt3Enabled());
		logger.info("----- Checking the title of Checkbox_button_4 is Enabled or not -----");
		Assert.assertTrue(cbp.isdisCheckopt4Enabled());
		logger.info("----- Checking the title of Checkbox_button_2 is Selected or not -----");
		Assert.assertTrue(cbp.isdisCheckopt2Selected());
		

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void MutlipleCheckBox() {
		
		logger.info("----- Verifying the functionality of MutlipleCheckBox -----");
		
		
		testSetUp();
		logger.info("----- Following all the steps to go to the checkbox page -----");
		lhp.clickOnBtnChechbox();
		logger.info("----- Asserting that btnCheckAllOpt2 is selected or not -----");
		Assert.assertEquals(false,cbp.isbtnCheckAllOpt2Selected());
		
		cbp.clickbtnCheckAll();
		logger.info("----- Asserting that btnCheckAllOpt2 is selected or not after clicking select All Button -----");
		Assert.assertTrue(cbp.isbtnCheckAllOpt2Selected());
		logger.info("----- clicking select all button -----");
		cbp.clickBtnCheckAllOpt2();
		logger.info("----- Asserting that btnCheckAllOpt2 is selected or not after clicking select All Button -----");
		Assert.assertEquals(false,cbp.isbtnCheckAllOpt2Selected());
	}
	
	

	
}
