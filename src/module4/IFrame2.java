package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 {

	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "F:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");

		driver.switchTo().frame(1);

		driver.findElement(By.name("ts_first_name")).sendKeys("Abhresh");

		driver.findElement(By.name("ts_last_name")).sendKeys("Sugandhi");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("ID_Frame2");

		driver.findElement(By.name("ts_first_name")).sendKeys("Abhresh");

		driver.findElement(By.name("ts_last_name")).sendKeys("Sugandhi");

		
	}

}
