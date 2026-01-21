package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = ".//src//test//resources//Features//Register.feature" ,
                    glue = "definition",
                    dryRun = false,
                    monochrome = true,
                    plugin = {"pretty",
                              "html:target/HTML Reports/htmlreport.html"}
                )

public class TestRunner {
}
