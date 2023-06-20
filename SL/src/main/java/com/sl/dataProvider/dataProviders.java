package com.sl.dataProvider;
import com.sl.utility.excelLibrary;
import org.testng.annotations.DataProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class dataProviders {
	excelLibrary xl=new excelLibrary();
	@DataProvider(name="Credentials")
	public Object[][] getCrdentials()
	{
		int rows=xl.getRowCount("Credentials");
		int columns=xl.getColumnCount("Credentials");
		int actualRows=rows-1;
		Object[][] data=new Object[actualRows][columns];
		for(int i=0;i<actualRows;i++)
		{
			for( int j=0;j<columns;j++)
			{
				
				data[i][j]=xl.getCellData("Credentials", j, i+2);
		}
		}
			return data;	
	}
	@DataProvider(name="NewAccount")
	public Object[][] getNewEmail()
	{
		int rows=xl.getRowCount("NewAccount");
		int columns=xl.getColumnCount("NewAccount");
		int actualRows=rows-1;
		Object[][] data=new Object[actualRows][columns];
		for(int i=0;i<actualRows;i++)
		{
			for( int j=0;j<columns;j++)
			{
				
				data[i][j]=xl.getCellData("NewAccount", j, i+2);
		}
		}
			return data;	
	}


	@DataProvider(name = "newAcountDetailsData")
	public Object[][] accountCreation() {

		// Totals rows count
		int rows = xl.getRowCount("AccountCreationData");
		// Total Columns
		int column = xl.getColumnCount("AccountCreationData");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<String, String>();
			for (int j = 0; j < column; j++) {
				hashMap.put(xl.getCellData("AccountCreationData", j, 1),
						xl.getCellData("AccountCreationData", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
}
