package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\venky\\Desktop\\JavaProjects\\CucumberBDD\\Features\\Whatfix.feature",
		glue="stepDefinitions")
		
public class TestRunner {

}
