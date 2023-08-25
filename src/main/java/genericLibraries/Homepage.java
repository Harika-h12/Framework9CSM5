package genericLibraries;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	// Declaration
		@FindBy(xpath="//button[@aria-label='Account settings']")
		private WebElement profileButton;
		@FindBy(xpath = "//li[.='My Profile']")
		private WebElement myProfile;
		
		// Initialization
		public Homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// Utilization
		public void clickProfileButton() {
			profileButton.click();
		}
		public void selectMyProfile() {
			myProfile.click();
		}
				

		
}


