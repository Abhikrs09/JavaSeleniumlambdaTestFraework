package PagesMArket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonData;
import utilities.elementsUtils;

public class signUpPage {
    public WebDriver driver;
    public elementsUtils elemUtil;

    public signUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        elemUtil= new elementsUtils(driver);
    }

    @FindBy(xpath ="//*[@id='content']//h1")
    private WebElement SignUpPageTitle;

    public boolean isDisplayedSignUpPageTitle(){
        return elemUtil.isElementDisplayed(SignUpPageTitle, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }
}
