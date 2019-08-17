package module8.Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {

	public GoogleHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "q")
	WebElement SearchTxt;
	
	@FindBy(partialLinkText = "Selenium - Web Browser Automa")
	WebElement LinkSel;
	
	
	public void SearchOnGoogle(String SearchInput) {
		
		SearchTxt.clear();
		SearchTxt.sendKeys(SearchInput);
		SearchTxt.submit();
	}
	
	public void ClickSelLink() {
		
		LinkSel.click();
	}
}
