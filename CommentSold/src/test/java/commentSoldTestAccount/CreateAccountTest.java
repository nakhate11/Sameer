package commentSoldTestAccount;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTestCreateAccount {
@Test
public void verify() {
	createAccountPage.createAccountPaths();
	AssertJUnit.assertEquals(createAccountPage.verifyCreateAcoount(), "Create Account");
}
}
