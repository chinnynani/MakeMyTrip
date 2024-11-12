package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortByPage {

	public SortByPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Popular']")
	private WebElement sortByOption_Popular;

	public WebElement getSortByOption_Popular() {
		return sortByOption_Popular;
	}
	public String getActiveSortOptionForPopular() {
		 return getSortByOption_Popular().getText();
	}
	public void sortByOption_PopularClick() {
		getSortByOption_Popular().click();
	}

	
	@FindBy(xpath = "//span[text()='User Rating ']")
	private WebElement sortByOption_Rating;

	public WebElement getSortByOption_Rating() {
		return sortByOption_Rating;
	}
	public String getActiveSortOptionForRating() {
		 return getSortByOption_Rating().getText();
	}
	public void getSortByOption_RatingClick() {
		getSortByOption_Rating().click();
	}

	
	@FindBy(xpath = "//span[text()='(Highest First)']/../..//span[text()='Price ']")
	private WebElement sortByOption_PriceHeighestFirst;

	public WebElement getSortByOption_PriceHeighestFirst() {
		return sortByOption_PriceHeighestFirst;
	}
	public String getActiveSortOptionForHighest() {
		return getSortByOption_PriceHeighestFirst().getText();
	}
	public void getSortByOption_PriceHeighestFirstClick() {
		getSortByOption_PriceHeighestFirst().click();
	}

	
	@FindBy(xpath = "//span[text()='(Lowest First)']/../..//span[text()='Price ']")
	private WebElement sortByOption_PriceLowestFirst;
	
	public WebElement getSortByOption_PriceLowestFirst() {
		return sortByOption_PriceLowestFirst;
	}
	public String getActiveSortOptionForLowest() {
		 return getSortByOption_PriceLowestFirst().getText();
	}
	public void getSortByOption_PriceLowestFirstClick() {
		getSortByOption_PriceLowestFirst().click();
	}
		
}
