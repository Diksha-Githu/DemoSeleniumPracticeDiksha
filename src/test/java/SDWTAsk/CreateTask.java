package SDWTAsk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTask {

    @FindBy(id="user-name")
    private WebElement userName;

    @FindBy(id="password")
    private WebElement passWord;
    @FindBy(id="login-button")
    private WebElement loginButton;

    WebDriver driver=null;

    public CreateTask(WebDriver driver){
        this.driver=driver;

        PageFactory.initElements(driver, CreateTask.class);

    }

    public void enterUsername(){
        userName.sendKeys("standard_user");
    }
    public void enterPass(){
        passWord.sendKeys("secret_sauce");
    }
    public void clickOnLogin(){
        loginButton.click();
    }

}
