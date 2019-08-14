package module6;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	// openBrowser @BeforeSuite
	// Open AUT @BeforeTest
	// Validate Login @Test
	// Logout @AfterTest
	// Close Browser @AfterSuit

	WebDriver driver;
	
	@AfterSuite
	public void CloseBrowser() {
		//Quit Browser
		driver.quit();
	}
		
	@AfterTest
	public void LogOut() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(5000);
	}
	
		
	@BeforeSuite
	public void OpenBrowser() {
		// Open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void OpenAUT() {
		//Open AUT
		driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public void LogIn() throws InterruptedException {
		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}	
}