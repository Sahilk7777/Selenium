package datadriventesting;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basicddt {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		//driver.findElement(By.name("email")).sendKeys("admin");
		//driver.findElement(By.name("password")).sendKeys("admin");
		FileInputStream File=new FileInputStream("src\test\\resources\\ADS.properties");
		Properties p=new Properties();
		p.load(File);
		String email = p.getProperty("Email");
		String pass = p.getProperty("Password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		
	}
}
