package apache_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P3_new_writing_cell 
{
	public static void main(String[] args) throws Throwable
	{
	FileInputStream f1 = new FileInputStream("D:\\SELENIUM\\selenium_project\\data\\excel1.xlsx");
	
			Workbook book = WorkbookFactory.create(f1);
			
			book.getSheet("demoData").createRow(7).createCell(0).setCellValue("TRISHA");
			
			FileOutputStream f2=new FileOutputStream("D:\\\\SELENIUM\\\\selenium_project\\\\data\\\\excel1.xlsx");
			
			book.write(f2);
	
}
}