package TestNGTC;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts {

    @Test
            public void alert() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.spicejet.com/");
        Thread.sleep(20000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));

        Alert al=driver.switchTo().alert();

      System.out.println(al.getText());
    al.accept();


    }
}
