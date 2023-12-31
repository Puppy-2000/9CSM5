package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//Declaration
		@FindBy(xpath = "//button[@aria-label='Account settings']")
		private WebElement profileButton;
		
		@FindBy(xpath = "//li[.='My Profile']")
		private WebElement myProfile;
		
		@FindBy(xpath = "//li[.='Logout']")
		private WebElement logout;
		
		@FindBy(xpath = "//a[text()='Electronic']")
		private WebElement Electronics;
		
		//Initilalization
		public Homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public void clickProfilebutton() {
			profileButton.click();
		}
		
		public void selectMyProfile() {
			myProfile.click();
		}
		
		public void clickLogout() {
			logout.click();
		}
	}

