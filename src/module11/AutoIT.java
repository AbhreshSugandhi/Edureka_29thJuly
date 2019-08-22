package module11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		driver.findElement(By.name("photo")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Programs_WorkSpace\\Edureka_Batches\\Edureka_29thJuly\\AutoitSikuli\\AutoITScript.exe");
		
		
	}

}
