package TestNGTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class HandlingRadio {
    public static void main(String args[]){
        WebDriver driver=new EdgeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
    List<WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));


    for(int i=0;i< radio.size();i++){
        WebElement rV=radio.get(i);

        String v=rV.getAttribute("value");

        System.out.println("Attribute is : "+v);

        if(v.equalsIgnoreCase("RUBY")){
            rV.click();
        }
    }
    driver.quit();
    }

}
