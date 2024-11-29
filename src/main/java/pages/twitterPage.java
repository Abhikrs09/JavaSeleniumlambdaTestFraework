package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonData;
import utilities.elementsUtils;

public class twitterPage {
	
	public WebDriver driver;
	public elementsUtils elemUtils;
	
	public twitterPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
	}
	
	@FindBy (xpath = "//span[text()='Log in']")
	private WebElement loginbtn;
	
	@FindBy(xpath ="//div[contains(@class,'css-901oao r-1awozwy')]//input[1]")
	private WebElement textUsername;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement btnNextUsername;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement txtPassword;
	
	@FindBy (xpath = "(//span[text()='Log in'])[2]")
	private WebElement btnMainLogin;
	
	public void clickloginbtn() {
		elemUtils.clickOnElement(loginbtn, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void settextUsername(String username) {
		elemUtils.typeTextIntoElement(textUsername, username, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickbtnNextUsername() {
		elemUtils.clickOnElement(btnNextUsername, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean settxtPasswordisEnabled() {
		return elemUtils.isElementEnabled(txtPassword, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean setTextPasswordIsDisplayed() {
		return elemUtils.isElementDisplayed(txtPassword, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void settxtPassword(String pass) {
		elemUtils.typeTextIntoElement(txtPassword, pass, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	public void clicktxtsetPassword() {
		elemUtils.clickOnElement(btnMainLogin, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickbtnLogin() {
		elemUtils.clickOnElement(btnMainLogin, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}

}
