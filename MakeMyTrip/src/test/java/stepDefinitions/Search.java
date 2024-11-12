package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Report;

import elementRepository.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class Search {
	 
	WebDriverUtility  webDriverUtility=new  WebDriverUtility();
	WebDriver driver=DriverFactory.getDriver();
	HomePage homepage=new HomePage(driver);
	FileUtility fileUtility=new FileUtility();
	
	@Given("Browser should be launched and url should be navigated and Pop up handled")
	public void browser_should_be_launched_and_url_should_be_navigated_and_pop_up_handled() {
		homepage.getHomePopUp().click();
	    Reporter.log("Pop up handled");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.makemytrip.com/");
	    Reporter.log("Browser Launched",true);	    
	}
	@When("User should be able to click on Homestays and villas link")
	public void user_should_be_able_to_click_on_homestays_and_villas_link() {
		Assert.assertTrue(homepage.getHomestaysAndVillasLink().isDisplayed(), "Homestays and Villas link is not visible");
		homepage.getHomestaysAndVillasLink().click();
	    Reporter.log("User clicked the Homestays and villas link",true);
	    
	}
	@Then("User should be navigated to Homestays and villas page")
	public void user_should_be_navigated_to_homestays_and_villas_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.makemytrip.com/homestays/");
	    Reporter.log("User is navigated to Homestays and villas page",true);
	}
	@When("User should be able to click on city lable option")
	public void user_should_be_able_to_click_on_city_lable_option() {
	    homepage.getCityLink().click();
//	    Assert.assertEquals(driver.getTitle(),homepage.getCityLabel());
	    Reporter.log("User is able to select the city lable option");
	}

	@When("User should be able to enter city name and select the city name")
	public void user_should_be_able_to_enter_city_name_and_select_the_city_name() throws Exception {
		homepage.cityName();
		WebElement cityname=homepage.getSelectCity();
		webDriverUtility.waitForElementPresent(driver, cityname);
		String city=fileUtility.getDataFromExcel("Sheet3", 0, 0);
		cityname.sendKeys(city);
		Thread.sleep(2000);
		cityname.sendKeys(Keys.ARROW_DOWN + "" + Keys.ENTER);
	    Reporter.log("User is able to set the city name");
	    
	}

	@When("User should be able to click on the check-in and select the date")
	public void user_should_be_able_to_click_on_the_check_in_and_selct_the_date() throws Exception {
		String month =fileUtility.getDataFromExcel("Sheet2", 0, 0);
	    int date=fileUtility.getNumericalDataFromExcel("Sheet2", 0, 1);
	    WebElement checkInDate =homepage.getInDate(driver, month, date);
	    checkInDate.click();
	    
//      Assert.assertEquals(checkInDate,homepage.getSelectedCheckInDateElement(), "Nov 30");
	    Reporter.log("User selected the check in date");
	    Thread.sleep(2000);
	    
	}

	@When("User should be able to click on the check-out and select the date")
	public void user_should_be_able_to_click_on_the_check_out_and_select_the_date() throws Exception {
		String month =fileUtility.getDataFromExcel("Sheet2", 1, 0);
	    int date=fileUtility.getNumericalDataFromExcel("Sheet2", 1, 1);
	    WebElement checkInDate =homepage.getInDate(driver, month, date);
	    checkInDate.click();
	    Reporter.log("User is able to click on check out option");
	    Thread.sleep(2000);
	}

	@When("User should be able to click on the Guests and select no of guests")
	public void user_should_be_able_to_click_on_the_guests_and_select_no_of_guests() throws Exception {
		 homepage.getGuestDropdown().click();
		 int count=fileUtility.getNumericalDataFromExcel("Sheet2", 1, 1);
		 Reporter.log("User selected the check out date");

	}
	
	@When("User should be able to click on Apply button")
	public void user_should_be_able_to_click_on_apply_button() throws InterruptedException {
	    homepage.apply();
	    Reporter.log("user clicks the apply button");
	   
	}

	@Then("User is able to click on the search button")
	public void user_is_able_to_click_on_the_search_button() throws InterruptedException {
	   homepage.search();
	   webDriverUtility.switchToTabOnTitle(driver, "Bangalore Hotels, resorts, homestays and more | MakeMytrip.com");
	   Reporter.log("user is clicks the search button");
	   Thread.sleep(2000);
	}

	@Then("User should be navigate to the Banglore properties")
	public void user_should_be_navigate_to_the_banglore_properties() {
	    Reporter.log("user navigates to the banglore properties page");
	}
	
	@Then("User is able to click on the INR button")
	public void user_is_able_to_click_on_the_inr_button() throws InterruptedException {
	    homepage.getInrButton().click();
	    Thread.sleep(3000);
	    Reporter.log("User is able to click on the INR button");
	}

	@Then("User is able to choose Indian Rupee option")
	public void user_is_able_to_choose_indian_rupee_option() throws Exception {
		homepage.getCurrency();
		WebElement currency=homepage.getIndianRupeeOption();
		webDriverUtility.waitForElementPresent(driver, currency);
		String currencyType=fileUtility.getDataFromExcel("Sheet4", 0, 0);
		currency.sendKeys(currencyType);
		Thread.sleep(2000);
		currency.sendKeys(Keys.ARROW_DOWN + "" + Keys.ENTER);
	    Reporter.log("User is able to choose Indian Rupee option");
	}
	
	@Then("user is able to click on the check out")
	public void user_is_able_to_click_on_the_check_out() throws InterruptedException {
	    homepage.getChangeCheckOutOption().click();
	    Thread.sleep(2000);
	}

	@Then("User is able to change the date and click on apply")
	public void user_is_able_to_change_the_date_and_click_on_apply() throws Exception {
		Thread.sleep(2000);
		String month =fileUtility.getDataFromExcel("Sheet2", 2, 0);
	    int date=fileUtility.getNumericalDataFromExcel("Sheet2", 2, 1);
	    WebElement checkInDate =homepage.getInDate(driver, month, date);
	    checkInDate.click();
	    Thread.sleep(3000);
	}
}
