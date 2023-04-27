package webtests;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import utilities.DriverSetup;
import webpages.ShawpnoComplainPage;
import webpages.ShawpnoHomePage;
import webpages.ShawpnoLoginPage;

public class Logintest extends DriverSetup {
	ShawpnoHomePage shawpnoHomePage = new ShawpnoHomePage();
	ShawpnoLoginPage shawpnoLoginPage = new ShawpnoLoginPage();
	ShawpnoComplainPage shawpnoComplainPage = new ShawpnoComplainPage();
	
	@Test(priority = 0, description = "Home Page Loading Test with base URL")
	@Description("Test Description: Load website with base URL and maximize the window")
	public void testHomePageUrl() {
		getDriver().get("https://www.shwapno.com");
		assertEquals(getDriver().getCurrentUrl(), "https://www.shwapno.com/");
		shawpnoHomePage.takeScreenShot("HomePage");
	}
	@Test
	public void testHomePageTitle() {
		getDriver().get("https://www.shwapno.com");
		assertEquals(getDriver().getTitle(), "Shwapno Online Grocery Shopping in Dhaka, Chattogram, Cumilla & Sylhet");	
		shawpnoHomePage.takeScreenShot("HomePage1");
	}
	
	@Test
	public void loginTest() {
		getDriver().get("https://www.shwapno.com");
		shawpnoHomePage.closePopup();
		shawpnoHomePage.clickOnLoginButton();
		shawpnoLoginPage.clickOnLoginWithEmailTab();
		shawpnoLoginPage.doLogIn("shihab4793@gmailcom", "1234567890");
		shawpnoLoginPage.clickOnLoginButton();
	}
	
	@Test
	public void testComplainPageTitle() {
		getDriver().get("https://www.shwapno.com/feedback");
		assertEquals(getDriver().getTitle(), "Feedback");	
		shawpnoHomePage.takeScreenShot("ComplainPage");
	}
	
	@Test
	public void doComplain() {
		getDriver().get("https://www.shwapno.com");
		shawpnoHomePage.closePopup();
		shawpnoHomePage.clickOnTopIcon();
		shawpnoHomePage.clickOnComplainBtn();
		shawpnoComplainPage.closePopup1();
		shawpnoComplainPage.clickDatePlaceholder();
		shawpnoComplainPage.clickOnLeftArrow();
		shawpnoComplainPage.selectDate();
		shawpnoComplainPage.enterName("sarkar");
		shawpnoComplainPage.enterOrderNO("01");
		shawpnoComplainPage.clickOnIssueDropdown();
		shawpnoComplainPage.clickOnOption();
		shawpnoComplainPage.clickOnSubmit();
	}
	
}
