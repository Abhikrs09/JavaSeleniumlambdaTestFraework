//package utilities;
//
//import java.time.Duration;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class elementsUtils {
//
//	private final WebDriver driver;
//
//	// Constructor
//	public elementsUtils(WebDriver driver) {
//		this.driver = driver;
//	}
//
//	// Helper method to wait for visibility or clickability of an element
//	private WebElement waitForElement(WebElement element, long durationInSeconds, boolean clickable) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
//		try {
//			if (clickable) {
//				return wait.until(ExpectedConditions.elementToBeClickable(element));
//			} else {
//				return wait.until(ExpectedConditions.visibilityOf(element));
//			}
//		} catch (Exception e) {
//			return null; // Return null if exception occurs (element not found)
//		}
//	}
//
//	private WebElement waitForElementVisibled(WebElement element, long durationInSeconds, boolean clickable) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
//		try {
//			if (clickable) {
//				return wait.until(ExpectedConditions.visibilityOf(element));
//			} else {
//				return wait.until(ExpectedConditions.visibilityOf(element));
//			}
//		} catch (Exception e) {
//			return null; // Return null if exception occurs (element not found)
//		}
//	}
//
//
//
//
//	// Wait for element and get its text
//	public String getTextFromElement(WebElement element, long durationInSeconds) {
//		WebElement webElement = waitForElement(element, durationInSeconds, true);
//		return webElement != null ? webElement.getText() : null;
//	}
//
//	// Drag and drop action
//	public void dragAndDrop(WebElement src, WebElement target) {
//		new Actions(driver).dragAndDrop(src, target).perform();
//	}
//
//	// Type text into an element
//	public void typeTextIntoElement(WebElement element, String textToBeTyped, long durationInSeconds) {
//		WebElement webElement = waitForElement(element, durationInSeconds, true);
//		if (webElement != null) {
//			webElement.clear();
//			webElement.sendKeys(textToBeTyped);
//		}
//	}
//
//	// Type text using keyboard actions
//	public void typeTextFromKeyboard(WebElement element, Keys keyToBeTyped, long durationInSeconds) {
//		WebElement webElement = waitForElement(element, durationInSeconds, true);
//		if (webElement != null) {
//			webElement.sendKeys(keyToBeTyped);
//		}
//	}
//
//
//	public void SwitchToiFrame(WebElement element,long durationInSeconds){
//		WebElement elem = waitForElementVisibled(element,durationInSeconds,true);
//		driver.switchTo().frame(element);
//	}
//
//	public void SwitchFrameToDefaultContent(){
//		driver.switchTo().defaultContent();
//	}
//
//
//
//	// Click on an element
//	public void clickOnElement(WebElement element, long durationInSeconds) {
//		WebElement webElement = waitForElement(element, durationInSeconds, true);
//		if (webElement != null) {
//			webElement.click();
//		}
//	}
//
//	// Check if element is displayed
//	public boolean isElementDisplayed(WebElement element, long durationInSeconds) {
//		WebElement webElement = waitForElement(element, durationInSeconds, false);
//		return webElement != null && webElement.isDisplayed();
//	}
//
//	// Check if element is enabled
//	public boolean isElementEnabled(WebElement element, long durationInSeconds) {
//		WebElement webElement = waitForElement(element, durationInSeconds, false);
//		return webElement != null && webElement.isEnabled();
//	}
//
//	// Check if element is selected
//	public boolean isElementSelected(WebElement element, long durationInSeconds) {
//		WebElement webElement = waitForElement(element, durationInSeconds, false);
//		return webElement != null && webElement.isSelected();
//	}
//
//	// Scroll down by pixels
//	public static void scrollDown(WebDriver driver, int pixels) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0," + pixels + ")");
//	}
//
//	// Accept alert
//	public void acceptAlert() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		if (alert != null) {
//			alert.accept();
//		}
//	}
//
//
//	public void SendTextAlertBox(String Text){
//		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		if (alert != null){
//
//			alert.sendKeys(Text);
//		}
//	}
//
//	// Dismiss alert
//	public void dismissAlert() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		if (alert != null) {
//			alert.dismiss();
//		}
//	}
//
//
//
//
//	// Get text from alert
//	public String getAlertText() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		return alert != null ? alert.getText() : null;
//	}
//
//	// Hover over an element
//	public void hover(WebElement element, long durationInSeconds) {
//		WebElement hoverElem = waitForElement(element, durationInSeconds, false);
//		if (hoverElem != null) {
//			new Actions(driver).moveToElement(hoverElem).perform();
//		}
//	}
//
//	public void SelectDropDownByVisibleText(WebElement element, String option, long durationInSeconds){
//		WebElement dropDownEl = waitForElement(element,durationInSeconds, true);
//		Select dropDown= new Select(dropDownEl);
//		dropDown.selectByVisibleText(option);
//		WebElement selectedOption = dropDown.getFirstSelectedOption();
//		System.out.println("Selected option: " + selectedOption.getText());
//		}
//	}
//
//
//



package utilities;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementsUtils {

	public static Logger logger = LogManager.getLogger(elementsUtils.class);

	private final WebDriver driver;

	// Constructor
	public elementsUtils(WebDriver driver) {
		this.driver = driver;
	}

	// Helper method to wait for visibility or clickability of an element
	private WebElement waitForElementToBeClickable(WebElement element, long durationInSeconds, boolean clickable) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
		try {
			if (clickable) {
				return wait.until(ExpectedConditions.elementToBeClickable(element));
			} else {
				return wait.until(ExpectedConditions.visibilityOf(element));
			}
		} catch (Exception e) {
			return null; // Return null if exception occurs (element not found)
		}
	}

	// Wait for element and get its text
	public String getTextFromElement(WebElement element, long durationInSeconds) {
		WebElement webElement = waitForElementToBeClickable(element, durationInSeconds, true);
		return webElement != null ? webElement.getText() : null;
	}

	// Drag and drop action
	public void dragAndDrop(WebElement src, WebElement target) {
		new Actions(driver).dragAndDrop(src, target).perform();
	}

	// Type text into an element
	public void typeTextIntoElement(WebElement element, String textToBeTyped, long durationInSeconds) {
		WebElement webElement = waitForElementToBeClickable(element, durationInSeconds, true);
		if (webElement != null) {
			webElement.clear();
			webElement.sendKeys(textToBeTyped);
		}
	}

	// Type text using keyboard actions
	public void typeTextFromKeyboard(WebElement element, Keys keyToBeTyped, long durationInSeconds) {
		WebElement webElement = waitForElementToBeClickable(element, durationInSeconds, true);
		if (webElement != null) {
			webElement.sendKeys(keyToBeTyped);
		}
	}

	// Correct method to switch to iframe
	public void switchToIframe(WebElement element, long durationInSeconds) {
		WebElement iframeElement = waitForElementToBeClickable(element, durationInSeconds, true);
		if (iframeElement != null) {
			driver.switchTo().frame(iframeElement);
		}
	}

	// Switch back to the default content from iframe
	public void switchFrameToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	// Click on an element
	public void clickOnElement(WebElement element, long durationInSeconds) {
		WebElement webElement = waitForElementToBeClickable(element, durationInSeconds, true);
		if (webElement != null) {
			webElement.click();
		}
	}

	// Check if element is displayed
	public boolean isElementDisplayed(WebElement element, long durationInSeconds) {
		WebElement webElement = waitForElementToBeClickable(element, durationInSeconds, false);
		return webElement != null && webElement.isDisplayed();
	}

	// Check if element is enabled
	public boolean isElementEnabled(WebElement element, long durationInSeconds) {
		WebElement webElement = waitForElementToBeClickable(element, durationInSeconds, false);
		return webElement != null && webElement.isEnabled();
	}

	// Check if element is selected
	public boolean isElementSelected(WebElement element, long durationInSeconds) {
		WebElement webElement = waitForElementToBeClickable(element, durationInSeconds, false);
		return webElement != null && webElement.isSelected();
	}

	// Scroll down by pixels
	public static void scrollDown(WebDriver driver, int pixels) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + pixels + ")");
	}

	// Accept alert
	public void acceptAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		if (alert != null) {
			alert.accept();
		}
	}

	// Send text to alert box
	public void sendTextAlertBox(String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		if (alert != null) {
			alert.sendKeys(text);
		}
	}

	// Dismiss alert
	public void dismissAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		if (alert != null) {
			alert.dismiss();
		}
	}

	// Get text from alert
	public String getAlertText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert != null ? alert.getText() : null;
	}

	// Hover over an element
	public void hover(WebElement element, long durationInSeconds) {
		WebElement hoverElem = waitForElementToBeClickable(element, durationInSeconds, false);
		if (hoverElem != null) {
			new Actions(driver).moveToElement(hoverElem).perform();
		}
	}

	// Select dropdown by visible text
	public void selectDropDownByVisibleText(WebElement element, String option, long durationInSeconds) {
		WebElement dropDownEl = waitForElementToBeClickable(element, durationInSeconds, true);
		Select dropDown = new Select(dropDownEl);
		dropDown.selectByVisibleText(option);
		WebElement selectedOption = dropDown.getFirstSelectedOption();
		System.out.println("Selected option: " + selectedOption.getText());
	}


	public void DDSelectByValue_Single(WebElement element,String name, long durationInSeconds){
		WebElement dd = waitForElementToBeClickable(element,durationInSeconds,true);
		Select select = new Select(dd);
		select.selectByValue(name);
	}


	public void DDSelectByValue_SingleJavaScriptExe(WebElement element, String name, long durationInSeconds) {
		// Wait for the dropdown element to be clickable, just as you did before.
		WebElement dd = waitForElementToBeClickable(element, durationInSeconds, true);

		// Use JavascriptExecutor to select the value in the dropdown
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '" + name + "';", dd);
	}

	public void DDSelectSingleValue_Action(WebElement dropdown, WebElement option, long durationInSeconds){
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).click().moveToElement(option).click().perform();
	}


	public void DDSelectByValue_Multiple(WebElement element, List<String> values, long durationInSeconds) {
		WebElement dd = waitForElementToBeClickable(element, durationInSeconds, true);
		Select select = new Select(dd);
		if (select.isMultiple()) {
			for (String value : values) {
				select.selectByValue(value);
			}
		}
	}

	public void DDSelectByVisibleText_Single(WebElement element,String name,long durationInSeconds){
		WebElement dd = waitForElementToBeClickable(element,durationInSeconds,true);
		Select select = new Select(dd);
		select.selectByVisibleText(name);
	}

	public void DDSelectByVisibleIndex_Single(WebElement element,int n,long durationInSeconds){
		WebElement dd = waitForElementToBeClickable(element,durationInSeconds,true);
		Select select = new Select(dd);
		select.selectByIndex(n);
	}


	public void DDSelectByVisibleText_Multiple(WebElement element, List<String> values, long durationInSeconds) {
		WebElement dd = waitForElementToBeClickable(element, durationInSeconds, true);
		Select select = new Select(dd);
		if (select.isMultiple()) {
			for (String value : values) {
				select.selectByVisibleText(value);
			}
		}
	}


	public void DDSelectByIndex_Multiple(WebElement element, List<Integer> values, long durationInSeconds) {
		WebElement dd = waitForElementToBeClickable(element, durationInSeconds, true);
		Select select = new Select(dd);
		if (select.isMultiple()) {
			for (int value : values) {
				select.selectByIndex(value);
			}
		}
	}


	public void DDPrintSelectedOptions_Multiple(WebElement element, long durationInSeconds) {
		WebElement dd=  waitForElementToBeClickable(element,durationInSeconds,true);
		Select select = new Select(dd);
		if (select.isMultiple()) {
			List<WebElement> selectedOptions = select.getAllSelectedOptions();
			logger.info("Selected options:");
			System.out.println("Selected options:");
			for (WebElement option : selectedOptions) {
				String str = option.getText();
				logger.info(str);
				System.out.println(str);
			}
		} else {
			logger.info("The dropdown does not support multiple selections.");
			System.out.println("The dropdown does not support multiple selections.");
		}
	}

	public String DDPrintSelectedOptions_Single(WebElement element,long durationInSeconds ){

		WebElement dd = waitForElementToBeClickable(element,durationInSeconds,true);
		Select select = new Select(dd);
		WebElement selectedOption = select.getFirstSelectedOption();
		String selectedText = selectedOption.getText();
		logger.info("The Selected Value from the Drop Down Box Is : ");
		logger.info(selectedText);
		return selectedText;



	}



}
