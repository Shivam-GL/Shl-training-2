package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {
	File f;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFRow row;
	XSSFCell cell;
    XSSFSheet sheet;
    
	public int no_of_rows;
	
	public ReadExcel() {
		try {
			this.f=new File(Constants.EXCELPATH);
			this.fis=new FileInputStream(f);
			this.wb=new XSSFWorkbook(fis);
			this.sheet=wb.getSheet("Sheet1");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int count_row() {
		return (sheet.getLastRowNum()-sheet.getFirstRowNum());	
	}
	
	
}
