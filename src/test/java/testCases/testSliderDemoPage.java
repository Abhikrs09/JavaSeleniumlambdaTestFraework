package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.lambdaHomePage;
import pages.sliderDemoPage;

public class testSliderDemoPage extends basePage {

	public static Logger logger = LogManager.getLogger(testSliderDemoPage.class);

	private lambdaHomePage lhp;
	private sliderDemoPage sdp;

	private void testSetUp(){

		lhp = new lambdaHomePage(driver);
	    sdp = new sliderDemoPage(driver);

	}


	@Test
	public void testSlider() {
	    
	    logger.info("----- Verifying the functionality of testSlider -----");
		testSetUp();
	    lhp.clickbtnDragAndDropSlider();
	    Assert.assertTrue(sdp.isSlider1Displayed());
	    sdp.Slider2Movement();
	    
	}
	
}
