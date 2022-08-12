package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/Sample2.feature"
        , glue = "stepdefinition"
        , dryRun = false

        , plugin = {"pretty","html:target/reports/report.html"
        ,"json:target/reports/report.json","junit:target/reports/report.xml"}
)
//,tags = "@subscription")
public class TestRunner {
}