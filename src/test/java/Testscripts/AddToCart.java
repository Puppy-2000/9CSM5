package Testscripts;


	import java.util.Map;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	import genericlabraries.BaseClass;

	public class AddToCart extends BaseClass{
		@Test
		public void addToCartTest() throws InterruptedException {
			Map<String, String> map = excel.getData("Sheet1", "Add to cart");
			welcome.clickloginButton();
			login.loginToApp(map.get("email"), map.get("password"));
			Thread.sleep(2000);
			home.mouseHoverToElectronic(webUtil);
			Thread.sleep(3000);
			home.clickHeadPhonesLink();
			headPhone.clickAddToCart();
			Thread.sleep(3000);
			Assert.assertEquals(headphones.getAddToCartText(), "ADDED");
			String itemName = headPhone.getitemNameString();
			headPhone.clickCartIcon();
			Assert.assertTrue(cart.getCartItem().equalsIgnoreCase(itemName));
			
			
		}
		

	}


}
