package TestNGTC;


import Base.Utility;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class Screenshots {

    @Test
    public void takeScrrenshots(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

        Utility.TakeScreenshots(driver, "home");
        System.out.println("Screenshot is captured");



    }
}
