package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonData;
import utilities.elementsUtils;

public class dropDownDemoPage {

    public static Logger logger = LogManager.getLogger(dropDownDemoPage.class);
    public WebDriver driver;
    public elementsUtils elemUtil;

    public dropDownDemoPage(WebDriver driver){
        this.driver=  driver;
        PageFactory.initElements(driver, this);
        elemUtil= new elementsUtils(driver);
    }


    @FindBy (xpath = "//select[@id ='select-demo']")
    WebElement DDSelectDaysSingle;

    @FindBy(xpath = "//p[@class='selected-value text-size-14']")
    WebElement selectedDay;

    public void selectSingleDaysFromDDByValue(String value){
        logger.info("Selecting Days From DD : "+ value);
        elemUtil.DDSelectByValue_Single(DDSelectDaysSingle,value, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void  selectDDSelectByValue_SingleJavaScriptExe(String value){
        logger.info("Selecting Days From DD : "+ value);
        elemUtil.DDSelectByValue_SingleJavaScriptExe(DDSelectDaysSingle,value, CommonData.EXPLICIT_WAIT_BASIC_TIME);

    }


    public void selectSingleDaysFromDDByVisibleText(String value){
        logger.info("Selecting Days From DD : "+ value);
        elemUtil.DDSelectByVisibleText_Single(DDSelectDaysSingle,value, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void selectSingleDaysFromDDByIndex(Integer value){
        logger.info("Selecting Days From DD : "+ value);
        elemUtil.DDSelectByVisibleIndex_Single(DDSelectDaysSingle,value, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public String getSelectedSingleDaysFromDD(){
        logger.info("Returning Selected Days From DD : ");
        String str = elemUtil.DDPrintSelectedOptions_Single(DDSelectDaysSingle,CommonData.EXPLICIT_WAIT_BASIC_TIME);
        return str;
    }









}
