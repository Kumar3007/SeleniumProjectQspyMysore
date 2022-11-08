//program to read the data from EXCEL SHEET
package apache_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class p1_sample_program {
	
	public static void main(String[] args) throws Throwable 
	{
		//finds the file and reads the data from file
	FileInputStream f=new FileInputStream("D:\\SELENIUM\\selenium_project\\data\\excel1.xlsx");
	
	//stores the data in workbookfactory
	Workbook book = WorkbookFactory.create(f);
	
	//to get the values from workbook
	String d = book.getSheet("demoData").getRow(3).getCell(0).getStringCellValue();
	
	System.out.println(d);//prints the data
	
	}

}
