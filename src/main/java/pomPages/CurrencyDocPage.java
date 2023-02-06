package pomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrencyDocPage {

	@FindBy(className = "DnbDropDown_label_1FF2R")
	private WebElement ModeDrpdwn;
	@FindBy(xpath = "//span[text()='Test Mode']")
	private WebElement TestDrpdwn;

	public CurrencyDocPage(WebDriver driver) {
		PageFactory.initElements(driver, this);}

	public void clickDropdown() {
		ModeDrpdwn.click();
	}
	public void testDropdown() {
		TestDrpdwn.click();
	}
}

