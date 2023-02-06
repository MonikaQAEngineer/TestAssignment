package testScripts;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import base.BaseClass;
import pomPages.APIExplorerPage;
import pomPages.LandingPage;
import pomPages.RegulatoryAPIPage;
public class RegulatoryAPITest extends BaseClass{
	@Test
	public void verifyTitle() throws InterruptedException 
	{
		LandingPage Lp = new LandingPage(driver);
		Lp.AcceptCookies();
		Lp.BrowseAPI();
		APIExplorerPage APIEx = new APIExplorerPage(driver);
		APIEx.RegulatoryAPI();
		RegulatoryAPIPage RegAPI = new RegulatoryAPIPage(driver);
		RegAPI.FirstAPIDoc();
		String ActualTitle = driver.getTitle();
		Reporter.log(ActualTitle,true);
		Assert.assertEquals(ActualTitle, "DNB Developer");
	}
}
