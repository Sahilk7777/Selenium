package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SKexcel {

	public static String main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream File=new FileInputStream("src\\test\\resources\\SK.properties.xlsx");
		Workbook Wb = WorkbookFactory.create(File);
		Sheet sh = Wb.getSheet("Sheet1");
		Row rw = sh.getRow(2);
		Cell cl = rw.getCell(1);
		String value1 = cl.getStringCellValue();
		System..out.println(value1);
		return value1;
	}

}
