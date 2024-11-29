package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.CommonData;
import utilities.elementsUtils;

public class sliderDemoPage {
	
	public static Logger logger = LogManager.getLogger(sliderDemoPage.class);

	
	public WebDriver driver;
	public elementsUtils elemUtils;
	
	public sliderDemoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
    }
	

	
	@FindBy (xpath = "//h1[contains(@class,'text-size-48 font-bold')]")
	private WebElement imgCheckBox;
	
	@FindBy (xpath = "(//input[@class='sp__range'])[2]")
	private WebElement btnSlider2;
	
	@FindBy (xpath = "(//input[@class='sp__range'])[1]")
	private WebElement btnSlider1;
	
	public void Slider2Movement() {
	    Actions actions = new Actions(driver);

	    logger.info("Initial loc: " + btnSlider2.getLocation());

	    // Get the initial value
	    String initialValue = btnSlider2.getAttribute("value");
	    logger.info("Initial value: " + initialValue);

	    actions.dragAndDropBy(btnSlider2, -50, 10).perform();

	    String updatedValue = btnSlider2.getAttribute("value");
	    logger.info("Updated value: " + updatedValue);

	}

	
	public boolean isSlider1Displayed() {	
		return elemUtils.isElementDisplayed(btnSlider1, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	
	

}
