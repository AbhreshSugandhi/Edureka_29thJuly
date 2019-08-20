package module10.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	static WebDriver driver;
	
	public static void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		driver = new ChromeDriver();
	}
	
	public static void Navigate() {
		
		driver.get("https://www.google.com/");
	}
	
	public static void ClickGmail() {
		
		driver.findElement(By.linkText("Gmail")).click();
	}


}


