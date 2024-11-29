package eComTestCases;


import PagesMArket.*;
import basePackage.basePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ReadingPropertiesFile;

public class testLoginpage extends basePage{

    public static Logger logger = LogManager.getLogger(testLoginpage.class);
    String validUserEmail = ReadingPropertiesFile.getProperty("LMusername");
    String validUserPass = ReadingPropertiesFile.getProperty("LMpass");
    String inValidUserEmail = ReadingPropertiesFile.getProperty("WrongLMusername");
    String inValidUserPass = ReadingPropertiesFile.getProperty("WrongLMpass");


    @Test
    public void T1_Verify_LoginPage_with_Valid_Email_and_Valid_Password_Successful_Login(){

    homePage hp = new homePage(driver);
    loginPage lp = new loginPage(driver);
    loginPageDashBoard lpd = new loginPageDashBoard(driver);
    Assert.assertTrue(hp.ishomePageLogoDisplayed());
    hp.hoverMyAccountDrop();
    hp.clickLoginBtn();
    lp.isDisplayedLoginPageTitle();
    lp.EnterEmailTextBox(validUserEmail);
    lp.EnterPassTextBox(validUserPass);
    lp.clickLoginBtn();
    lpd.isDisplayedLoginSucessTitile();

}

@Test
public void T2_Verify_Login_Page_with_empty_email_id_and_Valid_password(){
    homePage hp = new homePage(driver);
    loginPage lp = new loginPage(driver);
    loginPageDashBoard lpd = new loginPageDashBoard(driver);
    Assert.assertTrue(hp.ishomePageLogoDisplayed());
    hp.hoverMyAccountDrop();
    hp.clickLoginBtn();
    lp.isDisplayedLoginPageTitle();
    lp.EnterEmailTextBox("");
    lp.EnterPassTextBox(validUserPass);
    lp.clickLoginBtn();
    lp.isDisplayedLoginErrorMsg();

}

    @Test
    public void T3_Verify_Login_Page_with_Valid_email_id_and_empty_password(){
        homePage hp = new homePage(driver);
        loginPage lp = new loginPage(driver);
        loginPageDashBoard lpd = new loginPageDashBoard(driver);
        Assert.assertTrue(hp.ishomePageLogoDisplayed());
        hp.hoverMyAccountDrop();
        hp.clickLoginBtn();
        lp.isDisplayedLoginPageTitle();
        lp.EnterEmailTextBox(validUserEmail);
        lp.EnterPassTextBox("");
        lp.clickLoginBtn();
        lp.isDisplayedLoginErrorMsg();

}
    @Test
    public void T4_Verify_login_with_invalid_email_and_valid_password(){

        homePage hp = new homePage(driver);
        loginPage lp = new loginPage(driver);
        loginPageDashBoard lpd = new loginPageDashBoard(driver);
        Assert.assertTrue(hp.ishomePageLogoDisplayed());
        hp.hoverMyAccountDrop();
        hp.clickLoginBtn();
        lp.isDisplayedLoginPageTitle();
        lp.EnterEmailTextBox(inValidUserEmail);
        lp.EnterPassTextBox(validUserPass);
        lp.clickLoginBtn();
        lp.isDisplayedLoginErrorMsg();

}

    @Test
    public void T5_Verify_login_with_valid_email_and_invalid_password(){

        homePage hp = new homePage(driver);
        loginPage lp = new loginPage(driver);
        loginPageDashBoard lpd = new loginPageDashBoard(driver);
        Assert.assertTrue(hp.ishomePageLogoDisplayed());
        hp.hoverMyAccountDrop();
        hp.clickLoginBtn();
        lp.isDisplayedLoginPageTitle();
        lp.EnterEmailTextBox(validUserEmail);
        lp.EnterPassTextBox(inValidUserPass);
        lp.clickLoginBtn();
        lp.isDisplayedLoginErrorMsg();

    }

    @Test
    public void T6_Moving_to_SignUp_Page_from_Login_Page(){
        homePage hp = new homePage(driver);
        loginPage lp = new loginPage(driver);
        loginPageDashBoard lpd = new loginPageDashBoard(driver);
        signUpPage sp = new signUpPage(driver);
        Assert.assertTrue(hp.ishomePageLogoDisplayed());
        hp.hoverMyAccountDrop();
        hp.clickLoginBtn();
        lp.clickNewAccountbtn();
        sp.isDisplayedSignUpPageTitle();
    }

    @Test
    public void T7_Forgot_Password_Link_Functionality(){
        homePage hp = new homePage(driver);
        loginPage lp = new loginPage(driver);
        loginPageDashBoard lpd = new loginPageDashBoard(driver);
        forgotPassPage fp= new forgotPassPage(driver);
        Assert.assertTrue(hp.ishomePageLogoDisplayed());
        hp.hoverMyAccountDrop();
        hp.clickLoginBtn();
        lp.clickForgotPassBtn();
        fp.isDisplayedForgotPassTitle();

    }

    @Test
    public void T8_Verify_login_page_with_Empty_email_and_Empty_password(){
        homePage hp = new homePage(driver);
        loginPage lp = new loginPage(driver);
        loginPageDashBoard lpd = new loginPageDashBoard(driver);
        Assert.assertTrue(hp.ishomePageLogoDisplayed());
        hp.hoverMyAccountDrop();
        hp.clickLoginBtn();
        lp.isDisplayedLoginPageTitle();
        lp.EnterEmailTextBox("");
        lp.EnterPassTextBox("");
        lp.clickLoginBtn();
        lp.isDisplayedLoginErrorMsg();
    }






}
