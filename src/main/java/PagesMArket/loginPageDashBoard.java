package PagesMArket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonData;
import utilities.elementsUtils;

public class loginPageDashBoard {

    public WebDriver driver;
    public elementsUtils elemUtils;

    public loginPageDashBoard(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        elemUtils= new elementsUtils(driver);
    }


    @FindBy(xpath = "public elementsUtils elemUtils;")
    private WebElement LoginSucessTitile;


    public boolean isDisplayedLoginSucessTitile(){
        return elemUtils.isElementDisplayed(LoginSucessTitile, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

}
