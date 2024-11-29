package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;


import utilities.CommonData;
import utilities.elementsUtils;

public class keyPressPage {

	public WebDriver driver;
	public elementsUtils elemUtils;
	
	public keyPressPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
	}
	
	
	@FindBy(xpath = "//h1[text()='Key Press']")
	private WebElement keyPressHeading;
	
	
	@FindBy(xpath = "//div[@class='example']//input[1]")
	private WebElement textFieldEnterKey;
	
	@FindBy(xpath="(//div[@class='example']//p)[2]")
	private WebElement textResultEnterKey;
	
	
	public boolean isKeyPageHeadingApperas() {
		return elemUtils.isElementDisplayed(keyPressHeading, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void EntertextFieldEnterKey() {
		elemUtils.typeTextFromKeyboard(textFieldEnterKey, Keys.BACK_SPACE,CommonData.EXPLICIT_WAIT_BASIC_TIME );
	}
	
	public String printtextResultEnterKey() {
		return elemUtils.getTextFromElement(textResultEnterKey, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	
	
}
