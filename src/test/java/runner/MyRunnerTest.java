package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features="src/test/resources/feature",
		         glue={"stepdefination","hooks"},
		         dryRun = false,
		         tags="@all",
		         //publish = true,
		        plugin = {"pretty",
		        		  "html:taget/HTML CUCUMBER REPORT.html",
		        		 "json:target/CucumberReports/Cucumber Reports.json",
		        		 "junit:target/CucumberReports/Cucumber Reports.xml"
		         }
		 )        
	
		        
		
		       
public class MyRunnerTest {

}
