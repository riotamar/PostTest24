package PostTestDuaEmpat.StepByStep;

import PostTestDuaEmpat.StepByStep.Hooks;
import com.juaracoding.PostTestDuaEmpat.Pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRecruitment {
    WebDriver driver;
    private static ExtentTest extentTest;
    private RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruitment(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click menu Recruitment")
    public void user_click_menu_recruitment() {
        recruitmentPage.menuRecruitment();
        extentTest.log(LogStatus.PASS,"User click menu recruitment");
    }

    @And("User select by Hiring Manager")
    public void user_select_byHiringManager(){
        recruitmentPage.searchByHiringManager();
        extentTest.log(LogStatus.PASS, "User select by Hiring Manager");
    }
    @And ("User click button search")
    public void user_click_btnSearch(){
        recruitmentPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "User click button search");
    }
    @Then("Display by Linda Jane Anderson")
    public void display_by_Linda(){
        Assert.assertTrue(recruitmentPage.getTxtLinda().contains("Linda"));
        extentTest.log(LogStatus.PASS, "Display by Linda");
    }
}
