package pomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APIExplorerPage {

	//Declaration
	@FindBy(xpath = "//span[text()='Corporate APIs']")
	private WebElement CrptAPIbtn;
	@FindBy(xpath = "//span[text()='Regulatory APIs']")
	private WebElement RgltAPIbtn;
	
	//Initialization
	public APIExplorerPage(WebDriver driver) {
		PageFactory.initElements(driver,this);}

	//Utilization
	public void CorporateAPI() {
		CrptAPIbtn.click();
	}
	public void RegulatoryAPI() {
		RgltAPIbtn.click();
	}
}
