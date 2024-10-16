package TestNGTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdown {

    @Test
    public void verifyBootstrap(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@id='menu1']")).click();

        List<WebElement> drp=driver.findElements(By.xpath("//li[@role='presentation']/a"));
        System.out.println(drp.size());

        for(WebElement list:drp){
            String str= list.getAttribute("innerHTML");
            System.out.println(str);
            if(str.contentEquals("About Us")) {
                list.click();
                break;
            }

           String val=driver.findElement(By.xpath("//button[@id='menu1']")).getText();
            Assert.assertEquals(val, "About Us");
            System.out.println(val);

        }
    }
}
