package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "font14 fullWidth")
	private WebElement numberTestField;
	
	@FindBy(xpath = "//span[text()='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//a[text()='or Login via Password']")
	private WebElement loginViaPasswordLink;
	
	@FindBy(id="password")
	private WebElement passwoedTestField;
	
	@FindBy(xpath = "//button[@class='capText font16']")
	private WebElement loginButton;

	public WebElement getNumberTestField() {
		return numberTestField;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getLoginViaPasswordLink() {
		return loginViaPasswordLink;
	}

	public WebElement getPasswoedTestField() {
		return passwoedTestField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
}
