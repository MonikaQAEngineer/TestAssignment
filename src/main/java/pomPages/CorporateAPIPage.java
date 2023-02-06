package pomPages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CorporateAPIPage {
	private WebDriver driver;
	private By CurrDocbtn = By.xpath ("//a[@href='/documentation/currencies/@default/@latest']");
	public CorporateAPIPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickCurrenciesDoc() throws InterruptedException {
		WebElement element=driver.findElement(CurrDocbtn); 
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", element);
		
	}
}