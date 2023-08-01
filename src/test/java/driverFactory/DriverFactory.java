package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;

	public static void initialiazeBrowser(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	public static WebDriver getDriver() {
		return driver;

	}

}
