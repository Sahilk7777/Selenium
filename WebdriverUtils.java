package commanUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtils {
public WebDriver driver;
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void implicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	public void handeldropdown(WebElement element,String target)
	{
		Select s=new Select(element);
		s.selectByVisibleText(target);		
	}
	public void mousehover(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element);
		a.perform();
	}
	public void switchtowindow(WebDriver driver,String Expectedurl)
	{
		Set<String> ids = driver.getWindowHandles();
		for(String w:ids)
		{
			String aurl = driver.switchTo().window(w).getCurrentUrl();
			System.out.println(aurl);
			//String curl = "http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=";
			if(aurl.contains(Expectedurl))
			{
				break;
			}
		}
	}
	public File SC(WebDriver driver,String Screenshotname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File tempfile = ts.getScreenshotAs(OutputType.FILE);
		 File destination = new File("./Screenshot/SC1.png");
		 FileUtils.copyFile(tempfile, destination);
		 return destination;
	}
	}
	


