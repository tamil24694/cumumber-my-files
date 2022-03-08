package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateJVM {

	public static void report1(String json) {
		File report = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports");

		Configuration confi = new Configuration(report, "Adactin Web Automation");
		confi.addClassifications("Paltform", "Windows");
		confi.addClassifications("Version", "windown10");
		confi.addClassifications("sprint", "258");
		confi.addClassifications("Build", "AHW6655");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, confi);
		builder.generateReports();
	}

}
