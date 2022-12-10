package commentSoldMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//button[@class='ws-v2-button-primary mt-1r']")
	WebElement signButton;
	@FindBy(xpath = "//h1[text()='Account']")
	WebElement verifylogin;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginMethod() {
		username.sendKeys("sameer.nakhate11@gmail.com");
		password.sendKeys("Abc@1234");
		signButton.click();
	}

	public String verifyLog() {
		String v = verifylogin.getText();
		return v;
	}

}
