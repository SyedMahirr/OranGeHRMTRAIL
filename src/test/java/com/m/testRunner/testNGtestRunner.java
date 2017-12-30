package com.m.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testNGtestRunner {
	
	@CucumberOptions(
	        features = "Features",
	        glue="com.m.StepDeff",
	        tags= //{"@Solutions"}
	        //{"@HomeP"}
	  // {"@Request_A_Quote"}
	    //{"@AddUser"}
	    {"@Request_A_Quote_form"}
	    //"@uploadFile","@filter"}
	        )

	public class TestRunner extends AbstractTestNGCucumberTests{}

}
