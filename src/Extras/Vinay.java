package Extras;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vinay {

	public static void main(String[] args) {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "F:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		// SetScript Timeout
		driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");// 0-10
		driver.findElement(By.name("password")).sendKeys("tutorial");// 0-10
		driver.findElement(By.name("login")).click();// 0-10

	}

}
