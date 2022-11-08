//program for over writing the data
package apache_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class p2_over_writing 
{
	public static void main(String[] args) throws Throwable
	{
	FileInputStream f1 = new FileInputStream("D:\\SELENIUM\\selenium_project\\data\\excel1.xlsx");
	
			Workbook book = WorkbookFactory.create(f1);
			
			book.getSheet("demoData").getRow(3).getCell(0).setCellValue("TAMANNAH");
			
			FileOutputStream f2=new FileOutputStream("D:\\\\SELENIUM\\\\selenium_project\\\\data\\\\excel1.xlsx");
			
			book.write(f2);
			
	}
}
