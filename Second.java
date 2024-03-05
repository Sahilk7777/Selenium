package datadriventesting;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Second
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//FileInputStream File=new FileInputStream("\\src\\test\\resources\\lll.properties.xlsx");
		//Workbook wb=WorkbookFactory.create(File);
		//Sheet sh=wb.getSheet("Sheet1");
		//Row rw=sh.getRow(0);
		//Cell C1=rw.getCell(0);
		//String data=C1.getStringCellValue();
		//System.out.print(data);
	//File File=new File();
	FileInputStream fis=new FileInputStream("\"C:\\\\Users\\\\sahil\\\\OneDrive\\\\Desktop\\\\try.properties.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	Row rw = sh.getRow(0);
	Cell cl = rw.getCell(0);
	RichTextString data = cl.getRichStringCellValue();
	System.out.println(data);
	
	}                       
}
