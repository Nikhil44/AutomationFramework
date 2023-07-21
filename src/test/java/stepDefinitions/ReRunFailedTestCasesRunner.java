package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"@target/failedTestCases.txt"}
		,glue= {"stepDefinitions"}
		,monochrome= true
		//,plugin= {"pretty"}
		,plugin= {"pretty",
				"html:test-output/cucumberReports/CucumberReport.html",
				
		
		}		
		)
public class ReRunFailedTestCasesRunner {

}
