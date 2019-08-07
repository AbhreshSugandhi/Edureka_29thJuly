package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pAlert {

	public static void main(String[] args) {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "F:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");

		driver.findElement(By.id("prompt")).click();

		// Call the Alert Interface and switch to the Alert
		Alert pA = driver.switchTo().alert();

		System.out.println(pA.getText());
		
		pA.sendKeys("Abhresh S");
		
		pA.accept();

	}

}
