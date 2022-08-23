package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "./src/test/resources/features",
        glue = {"stepdefinitions","Hooks"},

<<<<<<< HEAD
        tags = "@testitemsGet",
=======
        tags = "@US025TC001",
>>>>>>> 5dc2e057debbcf853aa437362331cd799ea6830a
        dryRun = false
)
public class Runner {
}