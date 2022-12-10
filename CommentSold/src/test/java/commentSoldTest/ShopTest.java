package commentSoldTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopTest extends BaseTest {
	@Test
	public void verifyShoping() {
		loginPage.loginMethod();
		shopPage.shopPageMethod();
		AssertJUnit.assertEquals(shopPage.verifyPurchare(), "CommentSold QA");
	}
}
