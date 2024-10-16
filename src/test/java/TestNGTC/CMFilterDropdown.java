package TestNGTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CMFilterDropdown
{
    @Test
    public void CMDrop() throws InterruptedException {
        WebDriver driver =new EdgeDriver();
        driver.get("https://sdw-int.allianz.com/campaigns/campaign-library");
        Thread.sleep(10000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        driver.findElement(By.xpath("//div[@title='Period']//nx-multi-select")).click();

        List<WebElement> drp=driver.findElements(By.xpath("//*[@role='option']//span[1]"));

        for(WebElement drop:drp){
            String text=drop.getText();
            System.out.println(text);
            drop.click();
        }
    }
}
