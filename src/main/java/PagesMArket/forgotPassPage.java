package PagesMArket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonData;
import utilities.elementsUtils;

public class forgotPassPage {

    public WebDriver driver;
    public elementsUtils elemutil;

    public forgotPassPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        elemutil = new elementsUtils(driver);
    }


    @FindBy(xpath ="//*[@id='content']//h1")
    private WebElement ForgotPassTitle;

    public boolean isDisplayedForgotPassTitle(){
        return elemutil.isElementDisplayed(ForgotPassTitle, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }
}
