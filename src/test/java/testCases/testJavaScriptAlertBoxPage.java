package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.javaScriptAlertBoxPage;
import pages.lambdaHomePage;
import utilities.RetryAnalyzer;

public class testJavaScriptAlertBoxPage extends basePage{

	public static Logger logger = LogManager.getLogger(testHandelWindowsPage.class);

	private lambdaHomePage lhp;
	private javaScriptAlertBoxPage jsa;

	private  void testSetup(){

		lhp = new lambdaHomePage(driver);
		jsa = new javaScriptAlertBoxPage(driver);


	}

	@Test(enabled = true,retryAnalyzer = RetryAnalyzer.class)
	public void javaScriptAlert() {

		testSetup();
		logger.info("Home page is opened.");
		lhp.clickbtnJavaScriptAlert();
		logger.info("Alert page is opened.");
		jsa.clickbtnJavascriptClickMe();
		String AlertMessage= jsa.AcceptAndPrintAlertBoxMessage();
		System.out.println(AlertMessage);



	}

	@Test(enabled = true, retryAnalyzer = RetryAnalyzer.class)
	public void AcceptJavaScriptConfirmationBox(){

		testSetup();
		lhp.clickbtnJavaScriptAlert();
		jsa.ClickBtnConfirmBoxClickMe();
		String AlertMessage= jsa.AcceptAndPrintAlertBoxMessage();
		System.out.println(AlertMessage);
		String cmfBxMsg = jsa.ConfirmBoxMessage();
		System.out.println(cmfBxMsg);
	}


	@Test(enabled = true,retryAnalyzer = RetryAnalyzer.class)
	public void CancelJavaScriptConfirmationBox(){

		testSetup();
		lhp.clickbtnJavaScriptAlert();
		jsa.ClickBtnConfirmBoxClickMe();
		String AlertMessage= jsa.CancelAndPrintAlertBoxMessage();
		System.out.println(AlertMessage);
		String cmfBxMsg = jsa.ConfirmBoxMessage();
		System.out.println(cmfBxMsg);
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void SendTextAndAcceptTextPromptBox(){

		testSetup();
		lhp.clickbtnJavaScriptAlert();
		jsa.ClickBtnPromptBoxClickMe();
		jsa.AcceptAndSendTextToAlertBox();
		boolean bol = jsa.VisiblityOftextPromptBoxMessage();
		Assert.assertTrue(bol);
		String str = jsa.PromptBoxMessage();
		System.out.println(str);


	}

	@Test
	public void SendTextAndDismissTextPromptBox(){

		testSetup();
		lhp.clickbtnJavaScriptAlert();
		jsa.ClickBtnPromptBoxClickMe();
		jsa.DismissAndSendTextToAlertBox();
		boolean bol = jsa.VisiblityOftextPromptBoxMessage();
		Assert.assertFalse(bol);


	}
	
}
