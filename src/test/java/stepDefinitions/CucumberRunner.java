package stepDefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"Resources/features"}
		,glue= {"stepDefinitions"}
		,monochrome= true
		//,plugin= {"pretty"}
		,plugin= {"pretty",
				"html:test-output/cucumberReports/CucumberReport.html",
				"rerun:target/failedTestCases.txt"
		
		}		
		)

public class CucumberRunner{

}
