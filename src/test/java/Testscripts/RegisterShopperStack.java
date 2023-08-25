package Testscripts;
	import java.util.Map;

	import org.testng.annotations.Test;

	import genericlabraries.BaseClass;

	public class RegisterShopperTest extends BaseClass {
		@Test 
		public void createAccountTest() {
			welcome.clickloginButton();
			login.clickcreateAccountButton();
			
			Map<String, String>map = excel.getData("Sheet1","Shopper Registration");
			int randomNum =jutil.generateRandomNum(100);
			String email = randomNum +map.get("Email Address");
			String pwd = map.get("Password")+randomNum;

			import java.util.Map;

			import org.testng.annotations.Test;

			import genericlabraries.BaseClass;

			public class RegisterShopperTest extends BaseClass {
				@Test 
				public void createAccountTest() {
					welcome.clickloginButton();
					login.clickcreateAccountButton();
					
					Map<String, String>map = excel.getData("Sheet1","Shopper Registration");
					int randomNum =jutil.generateRandomNum(100);
					//String firstName=map.get("First Name")+randomNum;
					//String LastName=map.get("LastName")+randomNum;
					String email = randomNum +map.get("Email Address");
					String pwd = map.get("Password")+randomNum;
					SignUp.createUserAccount(map.get("FirstName"),map.get("LastName"),map.get("Gender"),map.get("PhoneNumber"),email,pwd);
					Thread.sleep(2000);
					welcome.cl
