package commanUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ListnerImplimentation implements ITestListener{
	ExtentSparkReporter reporter;
	ExtentReports report;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" "+"Execution is start",true);
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		System.out.println("Test execution is started");
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" "+"Execution is pass",true);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		String massege = result.getThrowable().toString();
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"Execution is fail"+massege );
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" "+"Execution is skipp",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
		//create onject of ExtentSparkReporter
	    reporter=new ExtentSparkReporter("./extentreport/report.html");
		reporter.config().setDocumentTitle("vtigercrm");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Sahilkonknai");
		 report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("os","windows");
		report.setSystemInfo("Browser", "chrome");
		report.setSystemInfo("chromversion", "121");
		report.setSystemInfo("Author","Sahil");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
		
		report.flush();
	}
}