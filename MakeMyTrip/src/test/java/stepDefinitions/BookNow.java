package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HomePage;
import elementRepository.BookNowPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.WebDriverUtility;

public class BookNow {

	WebDriver driver = DriverFactory.getDriver();
	BookNowPage bookpage = new BookNowPage();
	Actions act = new Actions(driver);
	WebDriverUtility webdriverutility = new WebDriverUtility();
	
	@When("User Should be choose the Property")
	public void user_should_be_choose_the_property() {
		Reporter.log("User clicked the propperty Page",true);
		bookpage.propertyClick(driver);
		Reporter.log("User is navigated to the propperty Page",true);
		
		webdriverutility.switchToTabOnTitle(driver, "The Hosteller Bangalore, Indiranagar | Hotel Details Page | MakeMyTrip.com");
	}

	@Then("User is able to click on the book this now button")
	public void user_is_able_to_click_on_the_book_this_now_button() throws InterruptedException {
		Reporter.log("User clicked the Book Now Button",true);
		bookpage.getBookingClick(driver);
		Assert.assertEquals(driver.getTitle(), "The Hosteller Bangalore, Indiranagar | Hotel Details Page | MakeMyTrip.com");
		Reporter.log("User is navigated to the Review your Booking Page",true);
		
		Thread.sleep(3000);
	}

	@Then("click on user agreement link")
	public void click_on_user_agreement_link() throws InterruptedException {
		
		Reporter.log("User is able to scroll to the Agreement link",true);
		webdriverutility.scrollToPosition(driver, 0, 1500);
		Thread.sleep(3000);
		
		Reporter.log("User clicked the Agreement link",true);
		bookpage.getAgreementDeatilsClick(driver);
		Thread.sleep(2000);
		
		webdriverutility.switchToTabOnTitle(driver, "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");

		Assert.assertEquals(driver.getTitle(), "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
		Reporter.log("User navigated to the Agreement Between User and MakeMyTrip page",true);
		Thread.sleep(4000);
	}
}
