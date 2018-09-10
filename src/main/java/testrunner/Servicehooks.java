package testrunner;

import com.qa.bdd.testBase.TestBase;
import com.qa.enu.browers;

import cucumber.api.java.Before;

public class Servicehooks {
	
	TestBase testbase;
	
	@Before
	public void initialization(){
		testbase.selectBrowser(browers.CHROME.name());
	}

}
