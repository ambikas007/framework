package hooks;

import driverFactory.DriverFactory;
import io.cucumber.java.Before;

public class MyHooks {
	
	
	
	@Before
	public void OpenUrl() {
		
		String url = "http://eqaroloflow.co.za/wp/my-account";
		DriverFactory.initialiazeBrowser(url);
		
		
	}

}
