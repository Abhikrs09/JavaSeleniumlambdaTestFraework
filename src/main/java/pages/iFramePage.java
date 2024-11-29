package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonData;
import utilities.ReadingPropertiesFile;
import utilities.elementsUtils;

public class iFramePage {

    public WebDriver driver;
    public elementsUtils elemUtils;

    public iFramePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
    }

    @FindBy(id="iFrame1")
    private WebElement notepad;

    @FindBy(xpath = "//div[@class='rsw-ce']")
    private WebElement NotepadArea;

    @FindBy(id = "iFrame2")
    private WebElement lambdaPageFrame;

    @FindBy(xpath ="//div[@class='home_inners']//p[contains(text(),'Selenium Testing')]")
    private WebElement lambdaPageFrameSeleTestBtn;

    @FindBy(xpath = "//h1[contains(text(),'Selenium Automation Testing Using LambdaTest')]")
    private WebElement SelTestHead;

    public boolean isVisiblelambdaPageFrameSeleTestBtn(){
        return elemUtils.isElementDisplayed(lambdaPageFrameSeleTestBtn,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public boolean isVisibleSeliFrame2(){
        return elemUtils.isElementDisplayed(lambdaPageFrame,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }
    public boolean isVisibleSelTestHead(){
        return elemUtils.isElementDisplayed(SelTestHead,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void clicklambdaPageFrameSeleTestBtn(){
        elemUtils.clickOnElement(lambdaPageFrameSeleTestBtn,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }



    public  void SwitchTolambdaPageFrame(){
        elemUtils.switchToIframe(lambdaPageFrame,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void ScrollBy100px(){
        elemUtils.scrollDown(driver,100);
    }

    public void SwitchToNotepadiFrame(){
        elemUtils.switchToIframe(notepad,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public boolean isFrameVisible(){
        return elemUtils.isElementDisplayed(notepad,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void SwitchToDefaultFrame(){
        elemUtils.switchFrameToDefaultContent();
    }

    public void WriteInNotepadArea(){
        String str = ReadingPropertiesFile.getProperty("message");
        elemUtils.typeTextIntoElement(NotepadArea,str, CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public String GetTextFromNotepadArea(){
        return elemUtils.getTextFromElement(NotepadArea,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public boolean NotepadAreaisEnabled(){
        return elemUtils.isElementEnabled(NotepadArea,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

    public boolean NotepadAreaisDisplayed(){
        return elemUtils.isElementDisplayed(NotepadArea,CommonData.EXPLICIT_WAIT_BASIC_TIME);
    }

}
