package module9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

	@FindBy(name = "ts_first_name")
	WebElement FName;
	
	@FindBy(name = "ts_last_name")
	WebElement LName;
	
	@FindBy(name = "ts_address")
	WebElement Address;
	
	public FormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	
	
	public void FormFill(String fName, String lName, String add) throws Exception {
		
		FName.clear();
		FName.sendKeys(fName);
		
		LName.clear();
		LName.sendKeys(lName);
		
		Address.clear();
		Address.sendKeys(add);
		
		Thread.sleep(5000);
		
	}
}


