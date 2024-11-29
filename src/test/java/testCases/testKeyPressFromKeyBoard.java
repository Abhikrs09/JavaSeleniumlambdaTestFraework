package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.keyPressPage;
import pages.lambdaHomePage;
import utilities.RetryAnalyzer;

public class testKeyPressFromKeyBoard extends basePage {

	public static Logger logger = LogManager.getLogger(testKeyPressFromKeyBoard.class);
	private lambdaHomePage lhp ;
	private keyPressPage kpp ;

	private void TestSetup(){

		lhp = new lambdaHomePage(driver);
		kpp = new keyPressPage(driver);

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void btncheck() {

		TestSetup();
		lhp.clickbtnKeyPress();
		kpp.EntertextFieldEnterKey();
		kpp.printtextResultEnterKey();
		
	}
	
	
}
