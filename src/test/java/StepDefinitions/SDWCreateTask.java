package StepDefinitions;

import SDWTAsk.CreateTask;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SDWCreateTask {

WebDriver driver;
    CreateTask ct;

    @Given("user open sdw browser and enter url")
    public void user_open_sdw_browser_and_enter_url() {
        driver=new EdgeDriver();
        //ct=new CreateTask(driver);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/auth/login");

    }

    @When("click on create task")
    public void click_on_create_task() {
        //ct.enterUsername();

    }

    @When("enter mandate details")
    public void enter_mandate_details() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
       // ct.enterPass();
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Then("task should be created")
    public void task_should_be_created() {
       // ct.clickOnLogin();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String str=driver.getTitle();

        System.out.println("Title is"+str);
    }

}
