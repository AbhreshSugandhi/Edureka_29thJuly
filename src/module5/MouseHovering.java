package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "F:\\Training\\Installation_stuff\\ExeFiles\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();
		//Open AUT
		driver.get("https://www.myntra.com/");
		
		//Search Jackets in the SearchBar
		driver.findElement(By.xpath("//*[@class='desktop-searchBar']")).sendKeys("Jackets");
				
		//Click on the search button to search
		driver.findElement(By.xpath("//*[@class='desktop-submit']")).click();
		
		//Hover on the first image to see if mouse hovering is working properly or not
		WebElement mh = driver.findElement(By.xpath("//*[@class='desktop-searchBar']//following::img[1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(mh).perform();
		
	}

}
