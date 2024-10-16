package TestNGTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DropdownPrintingAndSelctingValue {

    WebDriver driver;

    @BeforeTest()
    public void openBrowser(){
        driver =new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://formstone.it/components/dropdown/demo/");
    }

    @Test
    public void dropdown(){


        List<WebElement> dropList=driver.findElements(By.id("demo_basic"));
        for(WebElement drop:dropList){
            String value=drop.getText();
            System.out.println("Value is"+value);

            Select s=new Select(drop);
            WebElement first=s.getFirstSelectedOption();
            String fs=first.getText();
            System.out.println(("First selected"+fs));
               s.selectByVisibleText("Two");
            WebElement sele=s.getFirstSelectedOption();
            String ns=sele.getText();
            System.out.println("next sele"+ns);


           // Assert.assertEquals(ns, "Two", "Value is correct");



        }
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();;
        driver.quit();
    }
}
