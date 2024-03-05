package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Last_1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream File=new FileInputStream("src/test/resources/Last1is.properties.xlsx");
		Workbook WB = WorkbookFactory.create(File);
		Sheet sh = WB.getSheet("Sheet1");
		Row rw = sh.getRow(1);
		Cell cl = rw.getCell(1);
		String data = cl.getStringCellValue();
		System.out.println(data);
	}
}
