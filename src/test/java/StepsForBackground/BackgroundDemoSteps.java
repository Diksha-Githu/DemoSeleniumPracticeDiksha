package StepsForBackground;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BackgroundDemoSteps {

	WebDriver driver=new EdgeDriver();

	@Given("user is on login page")
	public void user_is_on_login_page() {


		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("enter un and pass");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {

		String title=driver.getTitle();
		System.out.println("Title is"+title);
	}



	@Given("user is logged in")
	public void user_is_logged_in() {
	}

	@When("user clicks on welcome link")
	public void user_clicks_on_welcome_link() {
	}

	@Then("logout link is displayed")
	public void logout_link_is_displayed() {
	}

	@When("user clicks on dashboard link")
	public void user_clicks_on_dashboard_link() {
	}

	@Then("quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
	}




}
