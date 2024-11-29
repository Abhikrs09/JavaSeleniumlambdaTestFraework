package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonData;
import utilities.elementsUtils;

public class checkBoxPage {

	
	public WebDriver driver;
	public elementsUtils elemUtils;
	
	public checkBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
    }
	
	@FindBy (xpath = "//h1[contains(@class,'text-size-48 font-bold')]")
	private WebElement imgCheckBox;
	
	@FindBy (xpath = "//label[text()='Click on check box']")
	private WebElement singleCheckbtn;
	
	@FindBy (xpath = "//div[text()='Checked']")
	private WebElement outputsingleCheckbtn;
	
	@FindBy (xpath = "(//input[@type='checkbox'])[2]")
	private WebElement disCheckopt1;
	
	@FindBy (xpath = "(//input[@type='checkbox'])[3]")
	private WebElement disCheckopt2;
	
	@FindBy (xpath = "(//label[text()='Option 3'])[1]")
	private WebElement disCheckopt3;
	
	@FindBy (xpath = "(//label[text()='Option 4'])[1]")
	private WebElement disCheckopt4;
	
	
	@FindBy (xpath = "//input[@value='Check All']")
	private WebElement btnCheckAll;
	
	@FindBy (xpath = "(//label[text()='Option 1'])[2]")
	private WebElement btnCheckAllOpt1;
	
	@FindBy (xpath = "(//input[@class='cb-element mr-10'])[2]")
	private WebElement btnCheckAllOpt2;
	
	@FindBy (xpath = "(//label[text()='Option 3'])[2]")
	private WebElement btnCheckAllOpt3;

	@FindBy (xpath = "(//label[text()='Option 4'])[2]")
	private WebElement btnCheckAllOpt4;
	
	@FindBy (xpath ="//input[@value='Check All']")
	private WebElement btnUncheckAll;
	
	public boolean isCheckboxTitleDisplayed() {
		return elemUtils.isElementDisplayed(imgCheckBox, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clicksingleCheckbtn() {
		elemUtils.clickOnElement(imgCheckBox, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean isOutputClicksingleCheckbtnDisplayed() {
		return elemUtils.isElementDisplayed(imgCheckBox, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}

	
	public void clickdisCheckopt1() {
		elemUtils.clickOnElement(disCheckopt1, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickdisCheckopt2() {
		elemUtils.clickOnElement(disCheckopt2, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickdisCheckopt4() {
		elemUtils.clickOnElement(disCheckopt4, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	
	public boolean isdisCheckopt1Enabled() {
		return elemUtils.isElementEnabled(disCheckopt1, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean isdisCheckopt3Enabled() {
		return elemUtils.isElementEnabled(disCheckopt3, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean isdisCheckopt2Selected() {
		return elemUtils.isElementSelected(disCheckopt2, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean isdisCheckopt4Enabled() {
		return elemUtils.isElementEnabled(disCheckopt4, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickbtnCheckAll() {
		elemUtils.clickOnElement(btnCheckAll, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}

	
	public void clickbtnCheckAllOpt1() {
		elemUtils.clickOnElement(btnCheckAllOpt1, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickBtnUncheckAll() {
		elemUtils.clickOnElement(btnCheckAll, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickBtnCheckAllOpt2() {
		elemUtils.clickOnElement(btnCheckAllOpt2, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean isclickbtnCheckAllOpt1Enabled() {
		return elemUtils.isElementEnabled(btnCheckAllOpt1, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean isbtnCheckAllOpt2Selected() {
		return elemUtils.isElementSelected(btnCheckAllOpt2,CommonData.EXPLICIT_WAIT_BASIC_TIME );
	}

}