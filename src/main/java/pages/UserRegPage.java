package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegPage extends BasePage {

	public UserRegPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id="gender-female")
	WebElement femaleRadBtn;
	
	@FindBy(id="FirstName")
	WebElement firstNameBox;
	
	@FindBy(id="LastName")
	WebElement lastNameBox;
	
	@FindBy(id="Email")
	WebElement emailBox;
	
	@FindBy(id="Password")
	WebElement passwordBox;
	
	@FindBy(id="ConfirmPassword")
	WebElement confPasswordBox;
	
	@FindBy(id="register-button")
	WebElement registerBtn;
	
	public void userRegistration(String firstName ,String lastName, String email, String Password)
	{
		femaleRadBtn.click();
		firstNameBox.sendKeys(firstName);
		lastNameBox.sendKeys(lastName);
		emailBox.sendKeys(email);
		passwordBox.sendKeys(Password);
		confPasswordBox.sendKeys(Password);
		registerBtn.click();
	}
	
	
}
