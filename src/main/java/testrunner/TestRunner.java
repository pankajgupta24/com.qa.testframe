package testrunner;

 import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features="src/test/Resources/Features", 
glue={"src/main/java/com/qa/bdd/stepdef"},
plugin={"PRETTY","HTML:TARGET/CUCUMBER-REPORTS/CUCUMBER-PRETTY"})


public class TestRunner {


private TestNGCucumberRunner testNGCucumberRunner;

@BeforeClass(alwaysRun=true)
public void setup(){
	
	testNGCucumberRunner= new TestNGCucumberRunner(this.getClass());
	
}
@Test(groups="cucumber", description="run cucumber feature", dataProvider="Features")
public void feature(CucumberFeatureWrapper cucumberFeature){
	
	
}
@DataProvider
public Object[][] features(){
	return testNGCucumberRunner.provideFeatures();
	
}
@AfterClass
public void tesrdown(){
	testNGCucumberRunner.finish();
	
}

}
