package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReaders;

import java.time.Duration;

public  class LoginSteps extends CommonMethods {
    LoginPage loginPage=new LoginPage();

    @When("user enters only password")
    public void user_enters_only_password() {
       sendText(ConfigReaders.read("password"), loginPage.password);
    }

    @When("clicks on the login button")
    public void clicks_on_the_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user can see the Username cannot be empty error message")
    public void user_can_see_the_username_cannot_be_empty_error_message() {
        System.out.println("Username cannot be empty error message is appearing");
    }

    @When("user enters only username")
    public void user_enters_only_username() {
       sendText(ConfigReaders.read("userName"), loginPage.userName);
    }
    @Then("user can see Password is empty error message")
    public void user_can_see_password_is_empty_error_message() {
        System.out.println("Password is empty error message is there");
    }

    @When("user enters an invalid userName and a valid password")
    public void user_enters_an_invalid_user_name_and_a_valid_password() {
      WebElement invalidUserName=driver.findElement(By.id("txtUsername"));
      invalidUserName.sendKeys("adm");
      sendText(ConfigReaders.read("password"), loginPage.password);
    }
    @Then("user can see the Invalid credentials error message")
    public void user_can_see_the_invalid_credentials_error_message() {
        System.out.println("Invalid credential error is visible ");
    }

    @When("user enters an invalid password and a valid userName")
    public void user_enters_an_invalid_password_and_a_valid_user_name() {
        WebElement invalidPassword = driver.findElement(By.id("txtPassword"));
        invalidPassword.sendKeys("Hum@nhrm12");
       sendText(ConfigReaders.read("userName"), loginPage.userName);

    }

    @When("user enters the valid userName and Password")
    public void user_enters_the_valid_user_name_and_password() {
        sendText(ConfigReaders.read("userName"), loginPage.userName);
        sendText(ConfigReaders.read("password"), loginPage.password);
    }
    @Then("user can see the dashboard page")
    public void user_can_see_the_dashboard_page() {
        System.out.println("Logged in successfully, zou are on the dashboard page");
    }





}

