package pages;


import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ReadingPropertiesFile;
import utilities.elementsUtils;
import utilities.CommonData;

import static utilities.JsonManager.readJsonFromFile;

public class javaScriptAlertBoxPage{

	public WebDriver driver;
	public elementsUtils elemUtils;
	
	public javaScriptAlertBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
    }


//	String AlertPageDataJson = ReadingPropertiesFile.getProperty("name");
//	JSONObject jsonData = readJsonFromFile(System.getProperty("user.dir")+AlertPageDataJson);
//	String name = jsonData.getString("name");
String AlertPageDataJson = ReadingPropertiesFile.getProperty("AlertPageDataJson");

	// Construct the absolute path of the JSON file
	String fullPath = System.getProperty("user.dir") + AlertPageDataJson.replace("\\", "/");

	// Read the JSON data from the file
	JSONObject jsonData = readJsonFromFile(fullPath);

	// Access the "name" value from the JSON
	String name = jsonData.getString("name");
	
	@FindBy(xpath ="//h1[text()='Javascript Alert Box Demo']")
	private WebElement title;
	
	@FindBy(xpath ="(//button[text()='Click Me'])[1]")
	private WebElement btnJavascriptClickMe;
	
	@FindBy(xpath ="(//button[text()='Click Me'])[2]")
	private WebElement btnConfirmBoxClickMe;
	
	@FindBy( xpath ="(//button[text()='Click Me'])[3]")
	private WebElement btnPromptBoxClickMe;
	
	@FindBy(css ="#confirm-demo")
	private WebElement textConfirmBoxMessage;
	
	@FindBy(css ="#prompt-demo")
	private WebElement textPromptBoxMessage;

	public void ClickBtnPromptBoxClickMe(){
		elemUtils.clickOnElement(btnPromptBoxClickMe,CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void AcceptAndSendTextToAlertBox(){

		elemUtils.sendTextAlertBox(name);
		elemUtils.acceptAlert();

	}

	public void DismissAndSendTextToAlertBox(){

		elemUtils.sendTextAlertBox(name);
		elemUtils.dismissAlert();

	}


	
	public void ClickBtnConfirmBoxClickMe(){
		elemUtils.clickOnElement(btnConfirmBoxClickMe,CommonData.EXPLICIT_WAIT_BASIC_TIME);

	}

	public String PromptBoxMessage(){
		return elemUtils.getTextFromElement(textPromptBoxMessage,CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean VisiblityOftextPromptBoxMessage(){
		return elemUtils.isElementDisplayed(textPromptBoxMessage,CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}



	public String AcceptAndPrintAlertBoxMessage() {

		String str = elemUtils.getAlertText();
		elemUtils.acceptAlert();
		return str;
    }


	public String CancelAndPrintAlertBoxMessage(){
		String str = elemUtils.getAlertText();
		elemUtils.dismissAlert();
		return str;

	}

	public String ConfirmBoxMessage(){
		String str = elemUtils.getTextFromElement(textConfirmBoxMessage,CommonData.EXPLICIT_WAIT_BASIC_TIME);
		return  str;
	}




	
	public void clickbtnJavascriptClickMe() {
		elemUtils.clickOnElement(btnJavascriptClickMe, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}



	
	
	
}
