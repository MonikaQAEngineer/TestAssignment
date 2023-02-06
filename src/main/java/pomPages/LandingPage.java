package pomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	@FindBy(xpath = "//span[@class='dnb-button__text dnb-skeleton--show-font' and text()='Browse APIs']")
	private WebElement BrAPIbtn;
	@FindBy(xpath = "//a[@class='consent-close' and text()='OK']")
	private WebElement AcptCookies;

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void BrowseAPI() {
		BrAPIbtn.click();
	}
	public void AcceptCookies() {
		AcptCookies.click();
	}
}
