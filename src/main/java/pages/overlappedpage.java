package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.elementsUtils;


public class overlappedpage {

    public WebDriver driver;
    public elementsUtils elemUtils;

    public overlappedpage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
    }

    @FindBy (xpath = "//div[@class='h-100 overflow-y-scroll']")
    private WebElement overlapped;


}
