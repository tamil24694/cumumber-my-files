package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.GenerateJVM;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Adactine.feature", glue = "org.stepdefinition1", dryRun = false, plugin = {
		"junit:src\\test\\resources\\Reports\\tamil.xml", "html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\adactin.json" })
public class TesrRunner {
	@AfterClass
	public static void TesrRunner2() {
		GenerateJVM.report1(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\adactin.json");
		
	}
}