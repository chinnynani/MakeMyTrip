package elementRepository;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//url	
	@FindBy(xpath = "//span[text()='Homestays & Villas'][1]")
	private WebElement homestaysAndVillasLink;

	public WebElement getHomestaysAndVillasLink() {
		return homestaysAndVillasLink;
	}
	public void getHomestaysAndVillasLinkClick() {
		getHomestaysAndVillasLink().click();
	}

//pop up handling	
	@FindBy(xpath = "//span[@data-cy='closeModal']")
	private WebElement homePopUp;

	public WebElement getHomePopUp() {
		return homePopUp;
	}
	public void PopUp() {
		getHomePopUp().click();
	}

//choosing city	
	@FindBy(id = "city")
	private WebElement cityLink;

	public WebElement getCityLink() {
		return cityLink;
	}
	public void getCityLinkClick() {
		getCityLink().click();
	}

	@FindBy(xpath = "//input[@title='Where do you want to stay?']")
	private WebElement selectCity;

	public WebElement getSelectCity() {
		return selectCity;
	}

	public void cityName() {
		selectCity.click();
	}


// check in date
	@FindBy(id = "checkin")
	private WebElement checkInDropdown;

	public WebElement getCheckInDropdown() {
		return checkInDropdown;
	}

	public void checkin() {
		getCheckInDropdown().click();
	}

	public WebElement getInDate(WebDriver driver, String month, int date) {
		return driver.findElement(By.xpath("//div[contains(text(),'" + month + "')]/../..//div[contains(@aria-label,'"
				+ month.substring(0, 3) + " " + date + "')]"));
	}

//check out date
	@FindBy(id = "checkout")
	private WebElement checkOutDropdown;

	public WebElement getCheckOutDropdown() {
		return checkOutDropdown;
	}

	public void checkOut() {
		getCheckOutDropdown().click();
	}

	public WebElement getOutDate(WebDriver driver, String month1, int date1) {
		return driver.findElement(By.xpath("//div[contains(text(),'" + month1 + "')]/../..//div[contains(@aria-label,'"
				+ month1.substring(0, 3) + " " + date1 + "')]"));
	}

//Guests count selection
	@FindBy(id = "guest")
	private WebElement guestDropdown;

	public WebElement getGuestDropdown() {
		return guestDropdown;
	}
	public void getGuestDropdownClick() {
		getGuestDropdown().click();
	}
	public void getadultsDropdownClick(WebDriver driver) {
		driver.findElement(By.xpath("(//div[@class='gstSlctCont'])[1]")).click();
	}
	@FindBy(xpath = "//ul[@class='gstSlct__list']/li[3]")
	private WebElement adultscount;

	public WebElement getAdultscount() {
		return adultscount;
	}
	public void getAdultscountClick() {
		getAdultscount().click();
	}


//Apply button
	@FindBy(xpath = "//button[@data-cy='RoomsGuestsNew_327']")
	private WebElement applyButton;

	public WebElement getApplyButton() {
		return applyButton;
	}

	public void applyButton() {
		getApplyButton().click();
	}

//search button	
	@FindBy(id = "hsw_search_button")
	private WebElement searchButton;

	public WebElement getsearchButton() {
		return searchButton;
	}

	public void searchButton() {
		getsearchButton().click();
	}

// choose currency type to INR
	
	@FindBy(xpath = "//p[@class='currencyLabel']")
	private WebElement inrButton;
	
	public WebElement getInrButton() {
		return inrButton;
	}
	public void getInrButtonClick() {
		getInrButton().click();
	}
	
	@FindBy(xpath = "//input[@placeholder='Search Currency']")
	private WebElement indianRupeeOption;

	public WebElement getIndianRupeeOption() {
		return indianRupeeOption;
	}
	public void getCurrency() {
		 indianRupeeOption.click();
	}

//To change the check out date  
	@FindBy(xpath = "//label[@class='lbl_input latoBold  font12 blueText capText']")
	private WebElement changeCheckOutOption;

	public WebElement getChangeCheckOutOption() {
		return changeCheckOutOption;
	}
	public void getChangeCheckOutOptionClick() {
		getChangeCheckOutOption().click();
	}

	public WebElement getChangeCheckOutDate(WebDriver driver, String month2, int date2) {
		return driver.findElement(By.xpath("//div[contains(text(),'" + month2 + "')]/../..//div[contains(@aria-label,'"
				+ month2.substring(0, 3) + " " + date2 + "')]"));
	}

	@FindBy(xpath = "//button[@class='primaryBtn btnApplyNew pushRight capText ']")
	private WebElement againClickApply;

	public WebElement getAgainClickApply() {
		return againClickApply;
	}

// validation for the navigation to homestays and villas   
	
	@FindBy(xpath = "//a[text()='Homestays and more in Bangalore']")
	private WebElement bangloreProperties;

	public WebElement getBangloreProperties() {
		return bangloreProperties;
	}

//user rating in sort by	
	@FindBy(xpath = "//li[@class='srtByFltr__list--item ' ][1]")
	private WebElement userRating;

	public WebElement getUserRating() {
		return userRating;
	}

	public void userRatingFromHighestFirst() {
		getUserRating().click();
	}

//Price heights first	
	@FindBy(xpath = "//li[@class='srtByFltr__list--item ' ][2]")
	private WebElement PriceHighestFirst;

	public WebElement getPriceHighestFirst() {
		return PriceHighestFirst;
	}

	public void priceH() {
		getPriceHighestFirst().click();
	}

//price lowest first
	@FindBy(xpath = "//li[@class='srtByFltr__list--item ' ][3]")
	private WebElement PriceLowestFirst;

	public WebElement getPriceLowestFirst() {
		return PriceLowestFirst;
	}

	public void priceL() {
		getPriceLowestFirst().click();
	}

//sort by

	@FindBy(xpath = "//span[text()='Popular']")
	private WebElement sortByOption_Popular;

	public WebElement getSortByOption_Popular() {
		return sortByOption_Popular;
	}
	public WebElement getActiveSortOptionForPopular() {
		return sortByOption_Popular;
	}

	@FindBy(xpath = "//span[text()='User Rating ']")
	private WebElement sortByOption_Rating;

	public WebElement getSortByOption_Rating() {
		return sortByOption_Rating;
	}
	public WebElement getActiveSortOptionForRating() {
		return sortByOption_Rating;
	}

	@FindBy(xpath = "//span[text()='(Highest First)']/../..//span[text()='Price ']")
	private WebElement sortByOption_PriceHeighestFirst;

	public WebElement getSortByOption_PriceHeighestFirst() {
		return sortByOption_PriceHeighestFirst;
	}
	public WebElement getActiveSortOptionForHighest() {
		return sortByOption_PriceHeighestFirst;
	}

	@FindBy(xpath = "//span[text()='(Lowest First)']/../..//span[text()='Price ']")
	private WebElement sortByOption_PriceLowestFirst;

	

//	@FindBy(xpath = "//span[text()='Sri Tirumala Paradise near KSR Bengaluru Railway Station']")
	@FindBy(id = "htl_id_seo_202204071302205878")
	private WebElement clickingTheProperty;

	public WebElement getClickingTheProperty() {
		return clickingTheProperty;
	}

	public WebElement getPropertyTitle() {
		return clickingTheProperty;
	}
	@FindBy(xpath = "//h1[text()='Sri Tirumala Paradise near KSR Bengaluru Railway Station']")
	private WebElement particularPropertyTitle;

	public WebElement getParticularPropertyTitle() {
		return particularPropertyTitle;
	}
		

}
