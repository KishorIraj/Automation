package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GSearchPage {
	
	WebDriver driver;
	public GSearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By searchbox = By.xpath("//input[@name='q']");
	By Search_btn = By.xpath("(//input[@name='btnK'])[1]");
	By Fb_Link = By.xpath("//a/h3[text()='Facebook - log in or sign up']");
	
	

	public void searchgoogle(String searchinput)  {
		try {
			driver.findElement(searchbox).sendKeys(searchinput);
			driver.findElement(Search_btn).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			System.out.println("Exception Cought" + e.getMessage());
		}	
	}
	
	public void ClickFb() {
		
		try {
			driver.findElement(Fb_Link).click();
			Thread.sleep(2000);
			} catch (Exception e) {
			System.out.println("Exception Cought" + e.getMessage());
		}
		
	}
	

}
