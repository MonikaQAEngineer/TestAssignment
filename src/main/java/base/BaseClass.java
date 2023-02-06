package base;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.PropertyFileReader;
import utils.Screenshot;

public class BaseClass {
	public WebDriver driver;
	public PropertyFileReader pdata= new PropertyFileReader();
	@BeforeMethod
	public void launchBrowser() throws FileNotFoundException, IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void takeScreenshot(ITestResult result) throws IOException {
		int status = result.getStatus();
		String name = result.getName();
		if (status==2) 
		{
			Screenshot ss = new Screenshot();
			ss.getPhoto(driver,name);
		}
		driver.quit();	
	}
}
