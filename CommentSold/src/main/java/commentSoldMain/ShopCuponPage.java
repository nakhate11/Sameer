package commentSoldMain;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopCuponPage extends BaseClass {
	@FindBy(xpath = "//a[text()=' Shop ']")
	WebElement shop;
	@FindBy(xpath = "//*[@class='icon-close w-6 h-6']")
	WebElement shopClick;
	@FindBy(xpath = "(//a[@class='button relative button--primary rounded button--regular' and text()='Click Here'])[1]")
	WebElement clickOnBanner;
	@FindBy(xpath = "//*[text()='Velvet Duvet Cover']")
	WebElement clickOnProduct;
	@FindBy(xpath = "//label[text()='Twin XL']")
	WebElement size;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath = "//a[text()='Checkout']")
	WebElement checkOut;
	@FindBy(xpath = "//button[text()='Add Code ']")
	WebElement addCode;
	@FindBy(xpath = "//input[@placeholder='Enter Code']")
	WebElement submitCode;
	@FindBy(id = "save-button")
	WebElement saveButton;
	@FindBy(xpath = "//img[@class='tw-mr-2']")
	WebElement lastButton;
	@FindBy(xpath = "//a[@class='webstore-checkout-btn']")
	WebElement closeShoping;
	@FindBy(xpath = "//a[@aria-label='Account']//*[name()='svg']")
	WebElement accountIcon;
	@FindBy(xpath = "//span[normalize-space()='Logout']")
	WebElement logOut;
	@FindBy(xpath = "//div[@class='shop-name']")
	WebElement logOutMsg;

	public ShopCuponPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void shopCuponPageMethod() throws InterruptedException {
		shop.click();
		shopClick.click();
		clickOnBanner.click();
		clickOnProduct.click();
		size.click();
		submit.click();
		checkOut.click();
		addCode.click();
		submitCode.sendKeys("5OFF20");
		saveButton.click();

	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",lastButton);
	
		try {
			closeShoping.click();
		} catch (StaleElementReferenceException e) {
			closeShoping.click();
		}
		accountIcon.click();
		logOut.click();
		logOutMsg.click();

	}

	public String verifyPurchare() {
		return logOutMsg.getText();

	}

}
