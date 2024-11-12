package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = {"stepDefinitions","hook"},
features= {"./src/test/resources/featureFiles"},
plugin={"rerun:target/rerun.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"junit:Reports/Cucumber.xml"})
public class parallelRunner extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {
		System.setProperty("dataproviderthreadcount", "2");
		return super.scenarios();
	}
}