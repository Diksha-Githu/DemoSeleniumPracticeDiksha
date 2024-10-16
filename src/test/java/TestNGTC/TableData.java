package TestNGTC;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableData {
    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        driver =new EdgeDriver();

    }
    @Test
    public void test1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.get("https://seleniumpractise.blogspot.com/2016/12/basic-form-creation.html");

        WebElement country= driver.findElement(By.id("country"));
            country.click();

            Thread.sleep(5000);
        Select s=new Select(country);

        s.selectByVisibleText("USA");

    }

    @AfterTest
    public void cloBrowser(){
        driver.close();
        driver.quit();

    }
}
