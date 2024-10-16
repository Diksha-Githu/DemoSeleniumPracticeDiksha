package TestNGTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Checkbox {
    public static void main(String args[]) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
        List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for(int i=0;i<check.size();i++){
            WebElement c=check.get(i);
            c.click();
        }



    }
}
