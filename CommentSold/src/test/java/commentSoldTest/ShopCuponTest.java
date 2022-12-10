package commentSoldTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopCuponTest extends BaseTest {
	@Test
	public void verifyShoping() throws InterruptedException {
		loginPage.loginMethod();
		shopCuponPage.shopCuponPageMethod();
		AssertJUnit.assertEquals(shopCuponPage.verifyPurchare(), "CommentSold QA");
	}
}
