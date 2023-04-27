package webpages;

import org.openqa.selenium.By;

public class ShawpnoComplainPage extends BasePage {

	private By POPUP1 = By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-draggable']//button[@title='close']");
	private By DATEPLACEHOLDER = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_txt_fdate']");
	private By LEFTARROW = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']");
	private By DATE = By.xpath("//a[normalize-space()='30']");
	private By NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_txt_First_Name']");
	private By ORDERNO = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_OrderNumber']");
	private By ISSUE = By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_txt_Issue_Type']");
	private By OPTIONS = By.xpath("//option[@value='ProductMissing']");
	private By SUBMITBTN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Submit']");
	
	public void closePopup1() {
		clickOnElement(POPUP1);
	}
	public void clickDatePlaceholder() {
		clickOnElement(DATEPLACEHOLDER);
	}
	public void clickOnLeftArrow() {
		clickOnElement(LEFTARROW);
	}
	public void selectDate() {
		clickOnElement(DATE);
	}
	public void enterName(String name) {
		writeText(NAME, name);
	}
	public void enterOrderNO(String number) {
		writeText(ORDERNO, number);
	}
	public void clickOnIssueDropdown() {
		clickOnElement(ISSUE);
	}
	public void clickOnOption() {
		clickOnElement(OPTIONS);
	}
	
	
	public void clickOnSubmit() {
		clickOnElement(SUBMITBTN);
	}
	
}

