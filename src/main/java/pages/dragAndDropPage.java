package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonData;
import utilities.elementsUtils;

public class dragAndDropPage {

	public WebDriver driver;
	public elementsUtils elemUtils;
	
	
	public dragAndDropPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
    }
	
	
	@FindBy (xpath = "//span[contains(text(),'Draggable 1')]")
	private WebElement drag1;
	
	@FindBy (xpath = "//span[@draggable='true']")
	private WebElement drag2;
	
	@FindBy(xpath = "//div[@dropzone='move']")
	private WebElement dropHere;
	
	//@FindBy (xpath ="//span[text()='Draggable 1']")
	@FindBy(xpath = "//div[@id = 'droppedlist']//span[contains(text(),'Draggable 1')]")
	private WebElement dragged1;
	
	@FindBy (xpath ="//span[text()='Draggable 2']")
	private WebElement dragged2;
	
	
	@FindBy (xpath = "//p[text()='Drag me to my target']")
	private WebElement dragObject;
	
	@FindBy (xpath = "//div[@class='ui-widget-header ui-droppable']")
	private WebElement dragPlace;
	
	@FindBy (xpath ="//p[text()='Dropped!']")
	private WebElement draggedorNot;
	
	
	
	public boolean drag1IsDisplayed() {
		return elemUtils.isElementDisplayed(drag1,  CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean drag2IsDisplayed() {
		return elemUtils.isElementDisplayed(drag2,  CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean dragged1IsDisplayed() {
		return elemUtils.isElementDisplayed(dragged1,  CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean dragged2IsDisplayed() {
		return elemUtils.isElementDisplayed(dragged2,  CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	 public void performDragAndDrop1() {
//	        Actions actions = new Actions(driver);
		 elemUtils.dragAndDrop(drag1,dropHere);
//	        actions.dragAndDrop(drag1, dropHere).perform();
	    }
	
	 
	 public void performDragAndDrop2() {
//	        Actions actions = new Actions(driver);
		 elemUtils.dragAndDrop(drag2,dropHere);
//	        actions.dragAndDrop(drag2, dropHere).perform();
	    }
	
	 public void performDragAndDrop3() {
//		 Actions actions = new Actions(driver);
		 elemUtils.dragAndDrop(dragObject, dragPlace);
//		 actions.dragAndDrop(dragObject, dragPlace).perform();
	 }
	 
	 public boolean isDisplayeddraggedorNot() {
		 return elemUtils.isElementDisplayed(draggedorNot, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	 }
	 

}
