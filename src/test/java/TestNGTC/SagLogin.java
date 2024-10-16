package TestNGTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SagLogin {

    @Test
    public void login(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        List<WebElement> addCart=driver.findElements(By.xpath("//*[text()='Add to cart']"));

        for(WebElement cart:addCart){
            cart.click();
        }
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        List<WebElement> items=driver.findElements(By.xpath("//*[@class='inventory_item_name']"));

        for(WebElement i:items){
            String str=i.getText();
            System.out.println("Items are : "+ str);
        }
    }
}
