package driverFactory;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\rs66360\\Music\\newworkspace\\selenium\\src\\test\\resources\\featurefiles\\seleniumScenario.feature",
		glue = {"stepDefinitions", "hooks"},
		plugin = {"pretty", "html:C:\\Users\\rs66360\\Music\\newworkspace\\selenium\\target\\report\\cucumberReport.html"}
		
		)
public class PlaceOrderRunner {
	
	
	

}
