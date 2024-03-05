package commanUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propp_1 {
public String getDataFromPropertyFile(String Keyname) throws IOException{
	FileInputStream file=new FileInputStream("src\\test\\resources\\Practies_1.properties");
	Properties p=new Properties();
	String value = p.getProperty(Keyname);
	return value ;
}
}
