package pomPages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegulatoryAPIPage {
	private WebDriver driver;
	private By FirstDocbtn = By.xpath("//a[contains(@href,'/documentation/')]");
	public RegulatoryAPIPage(WebDriver driver) {
		this.driver = driver;
	}
	public void FirstAPIDoc() {
		WebElement element=driver.findElement(FirstDocbtn);  
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", element);	
	}
}
