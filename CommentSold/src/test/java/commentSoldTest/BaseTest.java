package commentSoldTest;


import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;

import commentSoldMain.BaseClass;
import commentSoldMain.LoginPage;
import commentSoldMain.ShopCuponPage;
import commentSoldMain.ShopPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends BaseClass {
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://qatest.commentsoldrt.com/webstore-login?destination=/account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	}
	@BeforeClass
	public void pageObjects() {
		loginPage= new LoginPage(driver);
		shopPage = new ShopPage(driver);
		shopCuponPage= new ShopCuponPage(driver);
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
