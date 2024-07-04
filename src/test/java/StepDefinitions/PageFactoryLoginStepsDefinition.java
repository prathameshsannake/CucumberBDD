package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginPagePageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class PageFactoryLoginStepsDefinition {

	static WebDriver driver;
	LoginPagePageFactory loginPage;

	
	@Given("User is on Login page")
	public void user_is_on_login_page() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");

	}

	@When("^User enters Valid (.+) and (.+)$")
	public void user_enters_valid_username_and_password(String Username, String Password) {
		
		loginPage = new LoginPagePageFactory(driver);
		loginPage.enter_username_password(Username, Password);
	}
	
	@When("^User enters InValid (.+) and (.+)$")
	public void enter_Invalid_username_and_password(String Username, String Password) {
		
		loginPage = new LoginPagePageFactory(driver);
		loginPage.enter_username_password(Username, Password);
	    
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() throws InterruptedException {
		
		loginPage.click_on_submit_button();
		Thread.sleep(2000);

	}

	@Then("User is Navigated to the Home Page")
	public void user_is_navigated_to_the_home_page() {

		loginPage.verify_logo();
	}
	
	@Then("Proper Error should be display for user")
	public void Proper_Error_should_be_display_for_user() throws InterruptedException {
	    
		
		Thread.sleep(3000);
		loginPage.Error_msg_display_and_getErrorMsg();
		
		
	}	

	@And("Close the Browser")
	public void close_the_browser() {

		driver.quit();
	}

}
