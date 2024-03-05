package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class Final {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream file=new FileInputStream("src/test/resources/Last3is.properties.xlsx");
		Workbook Wb = WorkbookFactory.create(file);
		Sheet sh = Wb.getSheet("Sheet1");
		Row RW = sh.getRow(2);
		Cell cl = RW.getCell(1);
		String data = cl.getStringCellValue();
		System.out.println(data);

	}

}
