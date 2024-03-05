package commanUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil
{
	public String getDataFromPropertyFile(String Keyname) throws IOException{
	FileInputStream fis=new FileInputStream("src\\test\\resources\\Logincredentials.properties");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(Keyname);
	//FileInputStream file=new FileInputStream("src/test/resources/Last1is.properties.xlsx");
	return value;
	}
}
