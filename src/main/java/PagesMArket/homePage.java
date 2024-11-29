package PagesMArket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonData;
import utilities.elementsUtils;

public class homePage {

    public WebDriver driver;
    public elementsUtils elemUtils;

    public homePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
    }

    @FindBy(xpath = "//img[@alt ='Poco Electro']")
    private WebElement homePageLogo;

    @FindBy(xpath = "//i[@class='icon fas fa-user']")
    private WebElement MyAccountDrop;

    @FindBy(xpath = "//span[contains(text(),' Login')]")
    private WebElement LoginBtn;

    @FindBy(xpath = "//input[@placeholder='Search For Products'][1]")
    private WebElement SearchBox;

    @FindBy(xpath = "//button[@class='type-text']")
    private WebElement searchBtn;

    @FindBy(xpath = "//*[@id='button-continue']")
    private WebElement btnContinue;

    @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-left show']")
    private WebElement categoriesDropDown;

    public void selectCategoriesDropDownByVisibleText(String option){
        elemUtils.selectDropDownByVisibleText(categoriesDropDown, option, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void clickcategoriesDropDown(){
        elemUtils.getTextFromElement(categoriesDropDown, CommonData.EXPLICIT_WAIT_BASIC_TIME);
        elemUtils.clickOnElement(categoriesDropDown, CommonData.EXPLICIT_WAIT_BASIC_TIME);
        elemUtils.getTextFromElement(categoriesDropDown, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public boolean isDisplayedbtnContinue(){
        return elemUtils.isElementDisplayed(btnContinue, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public boolean ishomePageLogoDisplayed(){
        return elemUtils.isElementDisplayed(homePageLogo, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void clickMyAccountDrop(){
        elemUtils.clickOnElement(MyAccountDrop, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void enterInSearchBox(){
        elemUtils.typeTextIntoElement(SearchBox, "mobile", CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void clickLoginBtn(){
        elemUtils.clickOnElement(LoginBtn, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void clickSearchBtn(){
        elemUtils.clickOnElement(searchBtn, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void hoverMyAccountDrop(){
        elemUtils.hover(MyAccountDrop, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }
}
