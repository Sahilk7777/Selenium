package datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class prcatice {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("\"C:\\Users\\sahil\\OneDrive\\Desktop\\Book3.xlsx\"");
		FileInputStream file1=new FileInputStream(file);
		
		System.out.println(file1);

	}

}
