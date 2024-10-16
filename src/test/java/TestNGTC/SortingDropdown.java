package TestNGTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDropdown {
    public static void main(String args[]) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");


        WebElement  autoDropdown= driver.findElement(By.xpath("//*[@id='tools1']"));

        Select s=new Select(autoDropdown);
        List<WebElement> list=s.getOptions();
        System.out.println(list);

        List stored=new ArrayList();

        for(WebElement l:list){
            String str=l.getText();

            stored.add(str);
        }
        List sorting=new ArrayList();
        sorting.addAll(stored);

        Collections.sort(sorting);
        Assert.assertTrue(stored.equals(sorting));
 System.out.println(sorting);


    }

    }
