package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePageFactory {
	
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login-button")
	WebElement btn_login;
	
	@FindBy(xpath="//div[@class='app_logo']")
	WebElement lbl_logo;
	
	@FindBy(xpath="//h3[@data-test='error']")
	WebElement error_msg;
	

	public LoginPagePageFactory(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void enter_username_password(String Username, String Password)
	{
		txt_username.sendKeys(Username);
		txt_password.sendKeys(Password);
	}
	
	public void click_on_submit_button()
	{
		btn_login.click();
	}
	
	public void verify_logo()
	{
		System.out.println(lbl_logo.isDisplayed());
	}
	
	public void Error_msg_display_and_getErrorMsg()
	{
		System.out.println(error_msg.isDisplayed());
		System.out.println(error_msg.getText());
	}
	

}
