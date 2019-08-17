package module8.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module8.Page.GoogleHomePageObjects;
import module8.Page.SeleniumHomePageObjects;

public class GoogleSearch {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		page.SearchOnGoogle("SeleniumHQ");
		
		page.SearchOnGoogle("Edureka");
		
		page.SearchOnGoogle("Abhresh");
		
		page.SearchOnGoogle("SeleniumHQ");
		
		page.ClickSelLink();
				
		SeleniumHomePageObjects page2 = new SeleniumHomePageObjects(driver);
		
		Thread.sleep(5000);
		
		page2.GotoDownload();
		
		Thread.sleep(5000);
		
		page2.GotoHome();
		
		Thread.sleep(5000);
		
		page2.GotoProjects();
		
		
		
	}

}
