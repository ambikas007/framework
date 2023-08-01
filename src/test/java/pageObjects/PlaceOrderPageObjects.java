package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPageObjects extends PageObjectsBase {

	public PlaceOrderPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "username")
	private WebElement userNameField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement loginButton;

	@FindBy(xpath = "//span[text()='Shop']")
	private WebElement shopTabInHomePage;

	@FindBy(xpath = "//a[@aria-label='Visit product category Wine']")
	private WebElement wineInHomePage;

	@FindBy(xpath = "//h2[text()='Beyerskloof Pinotage 2019']")
	private WebElement BeyerskloofwineInWinePage;

	@FindBy(xpath = "//button[text()='Add to cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	private WebElement proceedtoCheckout;

	@FindBy(xpath = "//button[text()='Place order']")
	private WebElement placeOrder;
	
	@FindBy(xpath = "//li[@class='woocommerce-order-overview__order order']")
	private WebElement orderNumber;
	
	

	public void loginToApp(String uname, String pwd) throws InterruptedException {
		uname = "TestUser";
		pwd = "Tester5027#";

		Thread.sleep(2000);
		userNameField.click();
		userNameField.sendKeys(uname);
		passwordField.sendKeys(pwd);
		loginButton.click();

	}

	public void clickOnShopTab() {
		shopTabInHomePage.click();
	}
	
	public void clickOnWineInHomePage() throws InterruptedException {
		Thread.sleep(5000);
		wineInHomePage.click();
	}
	
	public void selectBeyerskloofBottleInWinePage() throws InterruptedException {
		Thread.sleep(3000);
		BeyerskloofwineInWinePage.click();
	}
	
	public void clickOnAddToCart() throws InterruptedException {
		Thread.sleep(5000);
		addToCartButton.click();
	}
	
	public void clickOnProceedButton() throws InterruptedException {
		Thread.sleep(5000);
		proceedtoCheckout.click();
	}
	
	public void clickOnPlaceOrder() throws InterruptedException {
		Thread.sleep(6000);
		placeOrder.click();
	}
	
	
	public void fetchOrderNuber() throws InterruptedException {
		Thread.sleep(3000);
		String orderNum = orderNumber.getText();
		System.out.print("order number is: "+ orderNum);
	}

}
