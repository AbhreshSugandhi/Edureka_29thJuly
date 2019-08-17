package module7;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GitHubLogin {

	WebDriver driver;
	
	@Parameters("System")
	@Test(priority = 0)
	public void openBrowser(String device) throws MalformedURLException {
		if (device.equalsIgnoreCase("pc1")) {
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(new URL("http://192.168.1.55:4646/wd/hub"), cap);

		} else if (device.equalsIgnoreCase("pc2")) {
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://192.168.1.55:4747/wd/hub"), cap);
		}
	}
	
	@Test(priority = 2)
	public void OpenAUT() {

		driver.get("https://github.com/");
		
	}

	@Parameters ({"Username", "Password"})
	@Test(priority = 3)
	public void Login(String UName, String Pass) throws InterruptedException {

		driver.findElement(By.xpath("//*[@href='/login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_field")).sendKeys(UName);
		
		driver.findElement(By.id("password")).sendKeys(Pass);
		
		driver.findElement(By.name("commit")).click();

	}

	@Test(priority = 4)
	public void Logout() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[8]/details/summary/img")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[8]/details/details-menu/form/button")).click();
				
	}

	@Test(priority = 5)
	public void CloseTestCase() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
