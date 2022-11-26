package PostTestDuaEmpat.StepByStep;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/01.Login.feature",
                "src/main/resources/features/02.Dashboard.feature",
                "src/main/resources/features/03.Recruitment.feature"},
        glue = "com.juaracoding.abdulazisposttestduaempat.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}


