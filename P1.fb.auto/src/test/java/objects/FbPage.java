package objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbPage {
	
	WebDriver driver;
	public FbPage(WebDriver driver) {
		this.driver=driver;
}
	
	By Username_editbox = By.id("email");
	By password_editbox = By.id("pass");
	By Login_Btn = By.name("login");
	
	public void EnterUsername() {
		driver.findElement(Username_editbox).clear();
		driver.findElement(Username_editbox).sendKeys("Testuser");
	}
	
	public void Enterpassword() {
		driver.findElement(password_editbox).clear();
		driver.findElement(password_editbox).sendKeys("Tester123");
	}
	
	public void VarifyLogin() {
		driver.findElement(Login_Btn).click();
		String title = driver.getTitle();
		assertEquals(title, "Facebook – log in or sign up");
	}
}