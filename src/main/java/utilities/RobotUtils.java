package utilities;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class RobotUtils {

    // Method to simulate pressing the "Enter" key to confirm the download dialog
    public static void pressEnter() throws Exception {
        // Create a Robot instance
        Robot robot = new Robot();

        // Wait for the dialog to appear (optional)
        Thread.sleep(1000);  // Adjust the sleep time as necessary

        // Simulate pressing the "Enter" key to confirm the download
        robot.keyPress(KeyEvent.VK_ENTER);  // Press the Enter key
        robot.keyRelease(KeyEvent.VK_ENTER);  // Release the Enter key
    }

    // Method to simulate pressing the "Escape" key to cancel the download dialog
    public static void pressEscape() throws Exception {
        // Create a Robot instance
        Robot robot = new Robot();

        // Wait for the dialog to appear (optional)
        Thread.sleep(1000);  // Adjust the sleep time as necessary

        // Simulate pressing the "Escape" key to cancel the download
        robot.keyPress(KeyEvent.VK_ESCAPE);  // Press the Escape key
        robot.keyRelease(KeyEvent.VK_ESCAPE);  // Release the Escape key
    }

    // Method to check if the file is downloaded
    public static boolean isFileDownloaded(String downloadDir, String fileName) {
        File dir = new File(downloadDir);
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.getName().equals(fileName)) {
                    return true; // File found
                }
            }
        }
        return false; // File not found
    }
}
