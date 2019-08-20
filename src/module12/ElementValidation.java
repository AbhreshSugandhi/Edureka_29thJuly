package module12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class ElementValidation {

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("phantomjs.binary.path", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		driver.findElement(By.id("profession-1")).click();
		
		WebElement checkBox = driver.findElement(By.id("profession-1"));
		
		boolean Validation = checkBox.isSelected();
		
		System.out.println(Validation);
	}
}
