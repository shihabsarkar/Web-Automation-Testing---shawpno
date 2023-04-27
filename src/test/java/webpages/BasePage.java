package webpages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Allure;

import static utilities.DriverSetup.getDriver;

import java.io.ByteArrayInputStream;
import java.time.Duration;

public class BasePage {
	public WebElement getElement(By locator) {
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	public void writeText(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public String getAlertText() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
	    Alert alert =  wait.until(ExpectedConditions.alertIsPresent());	
	    return alert.getText();
	}
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
	
	public void hoverOnAElement(By locator) {
		WebElement element = getElement(locator);
		Actions actions = new Actions(getDriver());
		actions.clickAndHold(element).build().perform();
	}
}

