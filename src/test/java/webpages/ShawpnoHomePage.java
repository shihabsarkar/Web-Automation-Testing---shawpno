package webpages;

import org.openqa.selenium.By;

public class ShawpnoHomePage extends BasePage {
	private By POPUP = By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-draggable']//button[@title='close']");
	private By LOGIN = By.xpath("//div[@id='myaccount']//a[contains(@class,'header-login-link')][normalize-space()='login']");
	private By TOPICON = By.xpath("//span[@class='Desk-TopMenuIcon']");
	private By COMPLAINBTN = By.xpath("//a[normalize-space()='Complain']");
	
	public void closePopup() {
		clickOnElement(POPUP);
	}
	
	public void clickOnLoginButton(){
		clickOnElement(LOGIN);
	}
	
	public void clickOnTopIcon() {
		clickOnElement(TOPICON);
	}
	public void clickOnComplainBtn() {
		clickOnElement(COMPLAINBTN);
	}

}
