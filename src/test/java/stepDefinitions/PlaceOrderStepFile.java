package stepDefinitions;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PlaceOrderPageObjects;

public class PlaceOrderStepFile {

	WebDriver driver;
	PlaceOrderPageObjects placeOrderPageObjects;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = DriverFactory.getDriver();
		System.out.print("user is on homepage");
	}

	@Given("user enter {string} and {string} and click on login button")
	public void user_enter_and_and_click_on_login_button(String string, String string2) throws InterruptedException {
		placeOrderPageObjects = new PlaceOrderPageObjects(driver);
		placeOrderPageObjects.loginToApp(string, string2);
	}

	@When("user click on shop menu")
	public void user_click_on_shop_menu() {
		placeOrderPageObjects = new PlaceOrderPageObjects(driver);
		placeOrderPageObjects.clickOnShopTab();
		
	}

	@When("user select wine")
	public void user_select_wine() throws InterruptedException {
		placeOrderPageObjects = new PlaceOrderPageObjects(driver);
		placeOrderPageObjects.clickOnWineInHomePage();
	}

	@When("user selects Bottle of Beyerskloof")
	public void user_selects_bottle_of_beyerskloof() throws InterruptedException {
		placeOrderPageObjects = new PlaceOrderPageObjects(driver);
		placeOrderPageObjects.selectBeyerskloofBottleInWinePage();
	}

	@Then("user add Beyerskloof to cart and place order")
	public void user_add_beyerskloof_to_cart_and_place_order() throws InterruptedException {
		placeOrderPageObjects = new PlaceOrderPageObjects(driver);
		
		placeOrderPageObjects.clickOnAddToCart();
		placeOrderPageObjects.clickOnProceedButton();
		placeOrderPageObjects.clickOnPlaceOrder();
	}

}
