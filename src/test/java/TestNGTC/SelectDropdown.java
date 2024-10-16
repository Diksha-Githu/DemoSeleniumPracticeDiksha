package TestNGTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SelectDropdown {
    public static void main(String args[]) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2F&locale=en_GB&display=page");


        WebElement dayDropdown=driver.findElement(By.xpath("//*[@id='day']"));

        //Day
        Select s=new Select(dayDropdown);
        WebElement firstDay=s.getFirstSelectedOption();
        System.out.println("Beforev: "+firstDay.getText());
        s.selectByVisibleText("1");
        WebElement selectedDay=s.getFirstSelectedOption();
        System.out.println("After: "+selectedDay.getText());
       // Assert.assertEquals(selectedDay.getText(),1, "Value is verified");

        //Month
        WebElement monthDropdown=driver.findElement(By.xpath("//*[@id='month']"));
        Select m=new Select(monthDropdown);
        WebElement firstSelected=m.getFirstSelectedOption();
        System.out.println("Before selected : "+firstSelected.getText());
        m.selectByVisibleText("Jan");
        WebElement afterSelected=m.getFirstSelectedOption();
        System.out.println("Before selected : "+afterSelected.getText());
        Assert.assertEquals(afterSelected.getText(),"Jan", "Value is verified");

        //Yesr
        WebElement yearDropdown=driver.findElement(By.xpath("//*[@id='year']"));
        Select y=new Select(yearDropdown);
        WebElement yeBe=y.getFirstSelectedOption();
        System.out.println("Befor year : "+yeBe.getText());
        y.selectByVisibleText("2022");
        WebElement afterYe=y.getFirstSelectedOption();
        System.out.println("After year : "+afterYe.getText());
        Assert.assertEquals(afterYe.getText(),"2022", "Value is verified");
        driver.quit();



    }
}
