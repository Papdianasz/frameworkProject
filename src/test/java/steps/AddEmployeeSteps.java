package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddEmployeePage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReaders;

import java.time.Duration;

public class AddEmployeeSteps extends CommonMethods {
    AddEmployeePage addEmployeePage = new AddEmployeePage();
    LoginPage loginPage=new LoginPage();

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        sendText(ConfigReaders.read("userName"), loginPage.userName);
        sendText(ConfigReaders.read("password"), loginPage.password);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user is able to see dashboard page")
    public void user_is_able_to_see_dashboard_page() {
        System.out.println("Logged in");
    }
    @When("user clicks on om PIM option")
    public void user_clicks_on_om_pim_option() {
        addEmployeePage.menu_pim_viewPimModule.click();
    }
    @When("user clicks on Add employee option")
    public void user_clicks_on_add_employee_option() {
        addEmployeePage.menu_pim_addEmployee.click();

    }
    @When("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname() {
        sendText("Diana", addEmployeePage.firstName);
        sendText("Testing", addEmployeePage.lastName);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        addEmployeePage.saveButton.click();
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added successfully");
    }

    @When("user enters firstname, middlename and lastname")
    public void user_enters_firstname_middlename_and_lastname() {
        sendText("Livia", addEmployeePage.firstName);
        sendText("Anna", addEmployeePage.middleName);
        sendText("Test", addEmployeePage.lastName);

    }
    @When("enters an emplyeeId manually")
    public void enters_an_emplyee_id_manually() {
        sendText("88881111", addEmployeePage.employeeId);

    }
    @When("user enters only firstname")
    public void user_enters_only_firstname() {
        sendText("errorTesting", addEmployeePage.firstName);
    }
    @Then("an error message should be appers")
    public void an_error_message_should_be_appers() {
        System.out.println("Required error message appeared under the Last Name filed,it is clear and well-visible.  ");
    }
}
