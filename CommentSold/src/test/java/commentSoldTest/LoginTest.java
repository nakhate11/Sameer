package commentSoldTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test
	public void verifyLoginPage() {
		loginPage.loginMethod();
		AssertJUnit.assertEquals(loginPage.verifyLog(), "ACCOUNT");
	}
}
