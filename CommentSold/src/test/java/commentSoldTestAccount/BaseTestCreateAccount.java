package commentSoldTestAccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import commentSoldAccount.BaseClassCreateAccount;
import commentSoldAccount.CreateAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestCreateAccount extends BaseClassCreateAccount {
	@BeforeClass
	public void createAccountUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qatest.commentsoldrt.com/webstore-register?destination=/account");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@BeforeClass
	public void pageObjects() {
		createAccountPage = new CreateAccountPage(driver);
	}
	@AfterClass
	public void tearDownEni() {
	driver.quit();
	}
}
