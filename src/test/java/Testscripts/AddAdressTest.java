package Testscripts;

   import java.util.Map;

	import org.apache.poi.ss.formula.functions.Address;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import genericlabraries.BaseClass;
	import genericlabraries.webDriverUtility;

	public class AddAddressTest extends BaseClass {
		@Test
		public void addAddressTest() throws Throwable {
			Map<String, String> map = excel.getData("sheet1", "Add Address");
			welcome.clickloginButton();
			login.loginToApp(map.get("email"), map.get("password"));
			Thread.sleep(3000);
			home.clickProfilebutton();
			Thread.sleep(2000);
			home.selectMyProfile();
			Thread.sleep(2000);
			myProfile.clickMyAddresses();
			myAddress.clickAddress();;
			address.addaddressDetails;
			Thread.sleep(2000);
			Assert.assertEquals(myAddress.getSucessfullMessage(),"Sucessfully added");
			Thread. sleep(2000);

}
