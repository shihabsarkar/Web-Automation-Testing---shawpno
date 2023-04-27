package webpages;

import org.openqa.selenium.By;

public class ShawpnoLoginPage extends BasePage{
	private By LOGINWITHEMAILTAB = By.xpath("//a[@id='tab2']");
	private By USERNAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_UserName']");
	private By PASSWORD = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_Password']");
	private By LOGINBUTTON = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_LoginImageButton']");

	
	public void clickOnLoginWithEmailTab() {
		clickOnElement(LOGINWITHEMAILTAB);
	}
	public void clickOnLoginButton() {
		clickOnElement(LOGINBUTTON);
	}
	
	public void doLogIn(String username, String password) {
		writeText(USERNAME, username);
		writeText(PASSWORD, password);
		clickOnElement(LOGINBUTTON);
		
	}
}
