package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingStep {
    @Given("Admin on login_page")
    public void adminOnLogin_page() {
    }

    @When("User input valid username {string} and password {string}")
    public void userInputValidUsernameAndPassword(String arg0, String arg1) {
    }

    @And("Click button {string}")
    public void clickButton(String arg0) {
    }

    @And("On Dashboard click menu Detail Booking")
    public void onDashboardClickMenuDetailBooking() {
    }

    @And("Select one Nama on tabel")
    public void selectOneNamaOnTabel() {
    }

    @And("Show Detail Pemesanan")
    public void showDetailPemesanan() {
    }

    @Then("Display Detail Pemesanan")
    public void displayDetailPemesanan() {
    }
}
