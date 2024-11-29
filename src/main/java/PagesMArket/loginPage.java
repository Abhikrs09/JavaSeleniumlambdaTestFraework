package PagesMArket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonData;
import utilities.ReadingPropertiesFile;
import utilities.elementsUtils;

public class loginPage
{
    public WebDriver driver;
    public elementsUtils elemUtils;

    public loginPage( WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        elemUtils = new elementsUtils(driver);
    }



    @FindBy (xpath = "//h2[contains(text(),'Returning Customer')]")
    private WebElement LoginPageTitle;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement EmailTextBox;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement PassTextBox;

    @FindBy(xpath = "//div[@class='form-group']//a[contains(text(),'Forgotten Password')]")
    private WebElement ForgotPassBtn;

    @FindBy(xpath ="//input[@type='submit']")
    private WebElement LoginBtn;

    @FindBy(xpath ="//div[@class='alert alert-danger alert-dismissible']")
    private WebElement LoginErrorMsg;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    private WebElement NewAccountbtn;

    public void clickNewAccountbtn(){
        elemUtils.clickOnElement(NewAccountbtn,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }


    public boolean isDisplayedLoginPageTitle(){
        return elemUtils.isElementDisplayed(LoginPageTitle, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public boolean isDisplayedLoginErrorMsg(){
        return elemUtils.isElementDisplayed(LoginErrorMsg, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void EnterEmailTextBox(String userEmail ){
        elemUtils.typeTextIntoElement(EmailTextBox,userEmail,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void EnterPassTextBox(String userPass ){
        elemUtils.typeTextIntoElement(PassTextBox,userPass,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void clickForgotPassBtn(){
        elemUtils.clickOnElement(ForgotPassBtn,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void clickLoginBtn(){
        elemUtils.clickOnElement(LoginBtn,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

}
