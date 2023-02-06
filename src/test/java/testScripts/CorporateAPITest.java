package testScripts;
import java.io.IOException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import base.BaseClass;
import pomPages.APIExplorerPage;
import pomPages.CorporateAPIPage;
import pomPages.CurrencyDocPage;
import pomPages.LandingPage;
public class CorporateAPITest extends BaseClass{
	@Test
	public void verifyURLs() throws InterruptedException, IOException
	{
		LandingPage Lp = new LandingPage(driver);
		Lp.AcceptCookies();
		Lp.BrowseAPI();

		APIExplorerPage APIEx = new APIExplorerPage(driver);
		APIEx.CorporateAPI();		

		CorporateAPIPage CrpAPI = new CorporateAPIPage(driver);
		CrpAPI.clickCurrenciesDoc();
		String ActualLMurl = driver.getCurrentUrl();
		Reporter.log(ActualLMurl,true);
		//DynamicURL, hence used contains method to validate URLs
		Assert.assertTrue(ActualLMurl.contains(pdata.getData("ExpectedLiveModeURL")));
		CurrencyDocPage CurrDoc = new CurrencyDocPage(driver);
		CurrDoc.clickDropdown();
		CurrDoc.testDropdown();
		String ActualTMurl = driver.getCurrentUrl();
		Reporter.log(ActualTMurl,true);
		Assert.assertTrue(ActualTMurl.contains(pdata.getData("ExpectedTestModeURL")));
	}
}