package module10.testCases;

import module10.actions.ActionKeywords;
import module10.utility.ExcelUtility;

public class TC {

	public static void main(String[] args) throws Exception {
		
		String Path = "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Programs_WorkSpace\\Edureka_Batches\\Edureka_29thJuly\\src\\module10\\testData\\MyDataEngine.xlsx";

		ExcelUtility.SetupExcel(Path, "Sheet1");
		
		for(int i=0; i<4; i++)
		{
			String Keywords = ExcelUtility.getData(i, 1);
			
			if(Keywords.equals("OpenBrowser"))
			{
				ActionKeywords.OpenBrowser();
			}
			else if (Keywords.equals("Navigate"))
			{
				ActionKeywords.Navigate();
			}
			else if (Keywords.equals("ClickGmail"))
			{
				ActionKeywords.ClickGmail();
			}
		}
	}

}
