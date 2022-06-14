package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    @Given("Admin on login page")
    public void adminOnLoginPage() {
    }

    @When("Admin input Invalid Username {string} on username field")
    public void adminInputInvalidUsernameOnUsernameField(String arg0) {
    }

    @And("Input valid password {string} on password field")
    public void inputValidPasswordOnPasswordField(String arg0) {
    }

    @And("Click button Masuk")
    public void clickButton(String arg0) {
    }

    @Then("Show Alert Error")
    public void showAlertError() {
    }
}
