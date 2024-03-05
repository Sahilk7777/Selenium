package commanUtils;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//WebDriver driver;

public class Baseclass 
{
	
	//public WebDriver driver;
	WebDriver driver =new ChromeDriver(); 
//	String URL=putil.getDataFromPropertyFile("Url");
	WebdriverUtils wutil=new WebdriverUtils();
	PropertyFileUtil putil=new PropertyFileUtil();
	//String URL=putil.getDataFromPropertyFile("Url");
	@Test
@BeforeSuite
public void BS()
{
	System.out.println("Connect to database");	
	}
@BeforeClass
public void BC() throws IOException
{
	//ExcelUtils eutil=new ExcelUtils();
	
	String URL=putil.getDataFromPropertyFile("Url");
	//WebdriverUtils wutil=new WebdriverUtils();
//	WebDriver driver =new ChromeDriver(); 
	wutil.maximize(driver);
	wutil.implicitwait(driver);
	driver.get(URL);
	}
@BeforeMethod
public void BM() throws IOException
{
	ExcelUtils eutil=new ExcelUtils();
	String Firstname = eutil.getDataFromExcel("Contacts", 0, 1);
	String Lastname = eutil.getDataFromExcel("Contacts", 1, 1);
	String ORGNAME = eutil.getDataFromExcel("Contacts", 3, 1);
	String USERNAME=putil.getDataFromPropertyFile("Username");
	String PASSWORD=putil.getDataFromPropertyFile("Password");
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[4]")).click();
	driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
	driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(Firstname);
	driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(Lastname);

	driver.findElement(By.xpath("//input[@name='assigntype'][2]")).click();
	WebElement drop = driver.findElement(By.name("assigned_group_id"));
	//WebElement drop = driver.findElement(By.xpath("//option[text()='Team Selling']"));
	Select s=new Select(drop);
	//s.selectByVisibleText("Team Selling");
	wutil.handeldropdown(drop,"Team Selling");
	driver.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();
	}
@AfterSuite
public void AS()
{
	System.out.println("disconect from database ");
	}
@AfterClass
public void AC()
{
	//use to close the browser
	//driver.quit();
	}
@AfterMethod 
public void AM() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement img = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
	wutil.mousehover(driver, img);
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
	}

}
