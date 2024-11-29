package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonData;
import utilities.elementsUtils;

public class handelWindowsPage {
	
	public WebDriver driver;
	public elementsUtils elemUtils;
	
	public handelWindowsPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
	}
	
	@FindBy (xpath = "//a[contains(text(),'Follow On Twitter')]")
	private WebElement btnFollowTwitter;
	
	@FindBy (xpath = "//a[contains(text(),'Like us On Facebook')]")
	private WebElement btnFollowFacebook;
	
	@FindBy (xpath = "//a[contains(text(),'Follow us On Linkedin')]")
	private WebElement btnFollowLinkedIn;
	
	public void clickbtnFollowTwitter() {
		elemUtils.clickOnElement(btnFollowTwitter, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickbtnFollowFacebook() {
		elemUtils.clickOnElement(btnFollowFacebook, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickbtnFollowLinkedIn() {
		elemUtils.clickOnElement(btnFollowLinkedIn, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}

}
