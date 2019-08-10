package Extras;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathVariations {

	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

// Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Documents\\Selenium\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();

//Navigating to box.com
		driver.get("https://www.box.com/");

//Maximize the webbrowser
//driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 50);

		WebElement ele = driver.findElement(By.xpath("//a[@role='article' and contains(text(), 'Get')]"));

//Click on Get button, once it gets loaded
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//click on Try it button of Starter tariif
		driver.findElement(By.xpath("//a[contains(text(), 'Try It') and @about='/node/5926']")).click();

//Get title of page
		String title = driver.getTitle();

		System.out.println(title);

		String expected = "Box Starter 14-Day Free Trial";

		boolean result = title.equals(expected);

		System.out.println(result);

		String header = driver.findElement(By.xpath("//*[@name=\"businessName\"]//preceding::h3")).getText();

//Print the heading of Starter Signup page
		System.out.println("Page header is" + header);

//Enter values under Business Name, Email and PAssword fields and click on Continue button

		driver.findElement(By.xpath("//input[@name='businessName']")).sendKeys("Decorum");

		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Decorum@gmail.com");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@name=\"businessName\"]//following::button[1]")).click();
	}
}