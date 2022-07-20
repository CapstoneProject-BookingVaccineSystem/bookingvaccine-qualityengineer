package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.HomePage;
import test.automation.pages.LoginPage;


public class LoginStep {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    // Background

    @Given("User on Login Screen")
    public void userOnLoginScreen() {
        boolean actual = loginPage.onLoginScreen();
        Assert.assertTrue(actual);
    }

    // TC_L1 =========
    @When("User input invalid NIK {string}")
    public void userInputInvalidNIK(String nik) throws InterruptedException {
        loginPage.inputFieldNIK(nik);
    }

    @And("User input valid Password {string}")
    public void userInputValidPassword(String pwd) throws InterruptedException {
        loginPage.inputFieldPassword(pwd);
    }

    @And("User tap \\(Masuk) button")
    public void userTapMasukButton() {
        loginPage.tapButtonMasuk();
    }

    @Then("Show message error {string}")
    public void showAlertError(String message) {
        Assert.assertEquals(message, loginPage.alertNikAtauPasswordSalah());
    }

    //TC_L2 ============
    @When("User input valid NIK {string}")
    public void userInputValidNIK(String nik) throws InterruptedException {
        loginPage.inputFieldNIK(nik);
    }

    @And("User input invalid Password {string}")
    public void userInputInvalidPassword(String pwd) throws InterruptedException {
        loginPage.inputFieldPassword(pwd);
    }

    @And("User tap button Masuk")
    public void userTapButtonMasuk() {
        loginPage.tapButtonMasuk();
    }

    @Then("Show error message \\(NIK atau Password Salah)")
    public void showErrorMessageNIKAtauPasswordSalah() {
        boolean actual = loginPage.alertNikAtauPasswordSalah();
        Assert.assertTrue(actual);
    }

    //TC_L3 =============
    @When("User tap button \\(MASUK)")
    public void userTapButtonMASUK() {
        loginPage.tapButtonMasuk();
    }

    @Then("Show error message")
    public void showErrorMessage() {
        loginPage.tapMasukFailed();
    }

    //TC_L4==================
    @When("User tap and type password {string}")
    public void userTapAndTypePassword(String pwd) throws InterruptedException {
        loginPage.inputFieldPassword(pwd);
    }

    @And("Click button masuk")
    public void clickButtonMasuk() {
        loginPage.tapButtonMasuk();
    }

    @Then("Show message error NIK tidak boleh kosong")
    public void showMessageErrorNIKTidakBolehKosong() {
        loginPage.messageNIKTidakBolehKosong();
    }

    //TC_L5======================
    @When("User tap and type NIK")
    public void userTapAndTypeNIK() throws InterruptedException {
        loginPage.inputFieldNIK("1616161616161616");
    }

    @And("Tap MasukButton")
    public void tapMasukButton() {
        loginPage.tapButtonMasuk();
    }

    @Then("Show Error Message PASSWORD TIDAK BOLEH KOSONG")
    public void showErrorMessagePASSWORDTIDAKBOLEHKOSONG() {
        loginPage.messagePasswordTidakBolehKosong();
    }

    //TC_L6 ===========
    @When("User input valid NIK {string} and Password {string}")
    public void userInputValidNIKAndPassword(String validnik, String validpwd) throws InterruptedException {
        loginPage.inputFieldNIK(validnik);
        loginPage.inputFieldPassword(validpwd);
    }

    @And("Tap button masuk")
    public void tapButtonMasuk() {
        loginPage.tapButtonMasuk();
    }

    @Then("User go to home screen")
    public void userGoToHomeScreen() {
        homePage.onHomeScreen();
    }






}
