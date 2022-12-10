package commentSoldMain;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage extends BaseClass {
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
	@FindBy(xpath = "//button[@class='_cta-button']")
	WebElement lastButton;

	@FindBy(xpath = "//a[@class='webstore-checkout-btn']")
	WebElement closeShoping;
	@FindBy(xpath = "//a[@aria-label='Account']//*[name()='svg']")
	WebElement accountIcon;
	@FindBy(xpath = "//span[normalize-space()='Logout']")
	WebElement logOut;
	@FindBy(xpath = "//div[@class='shop-name']")
	WebElement logOutMsg;

	public ShopPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void shopPageMethod() {
		shop.click();
		shopClick.click();
		clickOnBanner.click();
		clickOnProduct.click();
		size.click();
		submit.click();
		checkOut.click();
		lastButton.click();
		try {
			closeShoping.click();
		} catch (StaleElementReferenceException e) {
			closeShoping.click();
		}

		accountIcon.click();
		logOut.click();
	}

	public String verifyPurchare() {
		return logOutMsg.getText();

	}

}
