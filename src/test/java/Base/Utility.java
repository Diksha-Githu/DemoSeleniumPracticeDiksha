package Base;

import TestNGTC.Screenshots;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Utility {


    public static void TakeScreenshots(WebDriver driver, String screenshotName){

        try{
          TakesScreenshot ts=(TakesScreenshot)driver;
          File sorce=ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sorce, new File("./Screenshots/page.jpg"));
                    System.out.println("Sccessfully captured");


        } catch (Exception e) {
            System.out.println("Exception while capturing ss"+screenshotName+"home.jpg");
        }
    }
}
