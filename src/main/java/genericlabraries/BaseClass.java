package genericlabraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;

import Pompages.Cartpage;
import Pompages.Headphonepage;
import Pompages.Homepage;
import Pompages.ShopperLoginpage;
import Pompages.Signuppage;
import Pompages.welcomepage;
import pomPages.AddressPage;
import pomPages.CartPage;
import pomPages.HeadPhonesPage;
import pomPages.HomePage;
	import pomPages.MyAddressPage;
	import pomPages.MyProfilePage;
	import pomPages.ShopperLoginPage;
	import pomPages.SignUpPage;
import pomPages.WelcomePage;

	public class BaseClass {
		
		protected PropertiesUtility property;
		protected ExcelUtility excel;
		protected JavaUtility jutil;
		protected webDriverUtility webUtil;
		public static WebDriver driver;
		public static WebDriver sdriver;
		
		protected welcomepage welcome;
		protected ShopperLoginpage  login;
		protected Homepage home;
		protected Signuppage signUp;
		protected Pompages.MyProfilePage myProfile;
		protected Pompages.MyAddressPage myAddress;
		protected Headphonepage headPhone;
		protected Cartpage cart;
         
		protected Pompages.AddressPage address;
		
		//@BeforeSuite
		//@BeforeTest
		
		@BeforeClass
		public void classConfiguration() {
			property=new PropertiesUtility();
			excel= new ExcelUtility();
			jutil=new JavaUtility();
			webUtil=new webDriverUtility();
			
			property.propertiesInit(IConstantPath.PROPERTIES_PATH);
			excel.excelInit(IConstantPath.EXCEL_PATH);
		}
		
		@BeforeMethod
		public void methodconfiguration() {	driver= webUtil.navigateToApp(property.getData("browser"), property.getData("url"), Long.parseLong(property.getData("time")));
			sdriver=driver;
			
			welcome=new welcomepage(driver);
			login=new ShopperLoginpage (driver);
			home=new Homepage(driver);
			signUp=new Signuppage(driver);
			myProfile=new Pompages.MyProfilePage(driver);
			myAddress =new Pompages.MyAddressPage(driver);
			headPhone=new Headphonepage(driver);
			cart=new Cartpage(driver);
			address=new Pompages.AddressPage(driver);
			
		}
		@AfterMethod
		public void methodTeardown() {
			home.clickProfilebutton();
			  home.clickLogout();
			webUtil.closeallBrowsers();
		}
		@AfterClass
		public void classTeardown() {
			excel.Click();

	}
	//@AfterTest
		//AfterSuite
	
	
}

	
