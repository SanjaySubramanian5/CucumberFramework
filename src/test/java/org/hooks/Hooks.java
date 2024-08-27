package org.hooks;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    BaseClass base = new BaseClass();
	@Before
	public void launchBrowser(Scenario scenario) {
		base.browserLaunch();
		final byte[] source = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(source, "image/png");
		
	}
	
	@After
	public void closeBrowser(Scenario scenario) {
		final byte[] source = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(source, "image/png");
		base.close();
		
	}
}
