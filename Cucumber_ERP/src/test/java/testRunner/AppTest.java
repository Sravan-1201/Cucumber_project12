package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,
features= {"./featurefiles/Supplier.feature"},
tags="@LoginTest,@suppliers",
glue = {"stepDefination"},
plugin = {"pretty","html:target/report/cucumber"}
,monochrome = true)
public class AppTest extends AbstractTestNGCucumberTests {

}
