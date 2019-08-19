package module9.TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Objects;

import module9.Pages.FormPage;

public class DDT {

	//Open browser
	//Open AUT
	//FormFill - Fetch the data from Excel File
	//Close Browser
	
	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int norows;
	int nocols;
	
	
	@BeforeSuite
	public void OpenAUT() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");

	}
	
	@AfterSuite
	public void QuitProcess() {
		driver.quit();
	}
	
	@Test(dataProvider = "")
	public void FormFill(String fName, String lName, String add) throws Exception {
		
		FormPage fp = new FormPage(driver);
		
		fp.FormFill(fName, lName, add);
		
	}
	
	@DataProvider
	public Object[][] testDataFeeder() throws Exception{
		
		//To import the Excel file and fetch the bytes from the file
		FileInputStream fis = new FileInputStream("C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Programs_WorkSpace\\Edureka_Batches\\Edureka_29thJuly\\src\\module9\\TestData\\TestData.xlsx");
		
		//Open Workbook
		wb = WorkbookFactory.create(fis);
		
		//Open Sheet under the above workbook
		sh = wb.getSheet("Sheet1");
		
		//total of norows
		norows = sh.getLastRowNum()+1;
		System.out.println(norows);
				
		//total of nocols
		nocols = sh.getRow(0).getLastCellNum();
		System.out.println(nocols);
		
		Object[][] formData = new Object[norows][nocols];

		for(int row=0; row<norows; row++) 
		{
			for(int col=0; col<nocols; col++) 
			{
				//fetch the data from the cell using row and col numbers from the loop process
				formData[row][col] = sh.getRow(row).getCell(col).toString();
			}
		}
		return formData;
	}
}
