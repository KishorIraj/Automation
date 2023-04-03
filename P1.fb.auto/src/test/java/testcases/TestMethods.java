package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.FbPage;
import objects.GSearchPage;

public class TestMethods {
	WebDriver driver;
	GSearchPage objrctrepo;
	FbPage objrepo2;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}
	
	@Test(priority = 0)
	public void SearchOperation() throws InterruptedException {
		GSearchPage page = new GSearchPage(driver);
		page.searchgoogle("facebook");	
	}
	
	@Test(priority = 1)
	
	public void Verify_Access_Fb() {
		objrctrepo = new GSearchPage(driver);
		objrctrepo.ClickFb();	
	}
	
	@Test(priority = 2)
	public void VarifyLogin() {
		objrepo2 = new FbPage(driver);
		objrepo2.EnterUsername();
		objrepo2.Enterpassword();
		objrepo2.VarifyLogin();
	}
	
	
	
	
	@AfterTest
	public void aftertest() {
		
		driver.quit();
		
	}
	

}
