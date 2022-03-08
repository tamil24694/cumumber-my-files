package org.stepdefinition1;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {
	@Before
	public void driver() {
		setup();
		maximize();
		loadUrl("https://adactinhotelapp.com/index.php");
		waitImplecity(20);

	}

	@After
	public void closebrowser(Scenario s) {
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 byte[] ss = ts.getScreenshotAs(OutputType.BYTES);
		 s.embed(ss, "img/png");
		
		quit();
	}

}
