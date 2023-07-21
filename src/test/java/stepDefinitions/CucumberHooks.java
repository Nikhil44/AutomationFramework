package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }	
	
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        
        
    }
	

}
