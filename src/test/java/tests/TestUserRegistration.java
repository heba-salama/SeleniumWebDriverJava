package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegPage;

public class TestUserRegistration extends TestBase {
	
	HomePage homeObj;
	UserRegPage registerObj;
	
	
	@Test(priority=0)
	public void userCanRegSuccessfully()
	{
		homeObj=new HomePage(driver);
		homeObj.openRegPage();
		
		registerObj= new UserRegPage(driver);
		registerObj.userRegistration("Heba", "Elsayed", "Test11@test.com", "56464747744");
		
		System.out.println(driver.findElement(By.className("result")).getText());
		
		Assert.assertEquals("Your registration completed", driver.findElement(By.className("result")).getText());
		
//		Assert.assertTrue(driver.findElement(By.className("result")).getText().contains("registeration completed"));
			
	}
	
	@Test(priority=1)
	public void userCanNotRegSuccessfully()
	{
		homeObj=new HomePage(driver);
		homeObj.openRegPage();
//		driver.navigate().back();
		
		registerObj= new UserRegPage(driver);
		registerObj.userRegistration("Heba", "Elsayed", "Test11@test.com", "56464747744");
		
		System.out.println(driver.findElement(By.className("result")).getText());
		
		Assert.assertEquals("Your registration completed", driver.findElement(By.className("result")).getText());
		
//		Assert.assertTrue(driver.findElement(By.className("result")).getText().contains("registeration completed"));
		
		
	}
}
