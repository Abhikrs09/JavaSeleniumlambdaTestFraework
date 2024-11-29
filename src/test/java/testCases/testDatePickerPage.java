//package testCases;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import basePackage.basePage;
//import pages.datePickerPage;
//import pages.lambdaHomePage;
//
//public class testDatePickerPage extends basePage {
//
//    public static Logger logger = LogManager.getLogger(testDatePickerPage.class);
//
//    @Test
//    public void printCurrentdate() {
//
//        lambdaHomePage lhp = new lambdaHomePage(driver);
//        datePickerPage dpp = new datePickerPage(driver);
//
//        lhp.cilckbtnDatePicker();
//
//        // Get the current month and year
//        String currentMonthYear = dpp.printCurrentMonthYear();
//
//        // Add your assertion to validate the actual result
//        Assert.assertEquals(currentMonthYear, "ExpectedMonthYear", "Month and year are not as expected.");
//
//        // You can log the current month and year if needed
//        logger.info("Current Month and Year: " + currentMonthYear);
//    }
//}
