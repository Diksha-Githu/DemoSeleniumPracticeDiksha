package TestNGTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Errormessage {

    @Test
    public void verifyError(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("loginbutton")).click();

        String str1=driver.findElement(By.xpath("//div[@id='error_box']/div[1]")).getAttribute("innerHTML");
        String str2=driver.findElement(By.xpath("//div[@id='error_box']/div[2]")).getAttribute("innerHTML");

        System.out.println(str1);
        System.out.println(str2);
    }
}
