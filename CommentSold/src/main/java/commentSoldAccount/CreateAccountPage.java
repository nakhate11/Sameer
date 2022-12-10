package commentSoldAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends BaseClassCreateAccount {
	
	
	@FindBy(xpath="//input[@id='customer-first-name']")
	WebElement fname;
	@FindBy(xpath="//input[@id='customer-last-name']")
	WebElement lname;
	@FindBy(xpath="//input[@id='customer-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='customer-password']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;
	@FindBy(xpath="//h1[text()='Create Account']")
	WebElement acc;
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	public void createAccountPaths() {
		
		fname.sendKeys("Sameer");
		lname.sendKeys("Nakhate");
		email.sendKeys("sameer.nakhate11@gmail.com");
		password.sendKeys("Abc@1234");
		submitButton.click();
	}
	public String verifyCreateAcoount() {
		
		String a= acc.getText();
		return a;
	}
}
