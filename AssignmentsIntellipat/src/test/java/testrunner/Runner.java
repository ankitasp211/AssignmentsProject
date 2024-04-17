package testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featurefiles"},
        glue = {"stepdefinition"},
        tags = "@Module6Assignment1",
        plugin= {"pretty",
                "html:target/test-report/report.html",
                "json:target/test-report/report.json",
                "junit:target/test-report/report.junit"}
)

public class Runner {
}
