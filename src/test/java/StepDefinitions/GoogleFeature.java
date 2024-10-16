package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;


public class GoogleFeature {
   WebDriver driver;
    @Given("User opens browser")
    public void user_opens_browser() {
    System.out.println("Browser open");
    driver=new EdgeDriver();

    }
@Before
    public void openingBrowse(){
        System.out.println("Opening browser");
    }
    @After
    public void openBrowse(){
        System.out.println("Clocing browser");
    }
    @BeforeStep
    public void beofewStep(){
        System.out.println("Before each steps");
    }


    @When("user opens url")
    public void user_opens_url() {
        System.out.println("Open url");
        driver.get("https://www.google.com/");
    }

    @And("enter un and pass")
    public void enter_un_and_pass() {
        System.out.println("enter text in search bar");


    }

    @And("click on login")
    public void click_on_login() {
        System.out.println("Verify search bar");
        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Cricket");

    }

    @Then("homepage shold be displayed")
    public void homepage_shold_be_displayed() throws InterruptedException {
        System.out.println("Click on enter");
        Thread.sleep(2000);
        List<WebElement> list= driver.findElements(By.xpath("//*[@role='option']/div[1]/span"));
        System.out.println(list.size());

        for(int i=0;i<=list.size();i++) {

                String str = list.get(i).getText();
                while(str.length()>=0) {
                    System.out.println("String is : " +str);


                    driver.quit();
                }

        }
    }

}
