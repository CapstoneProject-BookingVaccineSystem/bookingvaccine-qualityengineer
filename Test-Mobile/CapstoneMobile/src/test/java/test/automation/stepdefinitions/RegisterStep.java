package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.LoginPage;
import test.automation.pages.RegisterPage;

public class RegisterStep {
    @Steps
    LoginPage loginPage;

    @Steps
    RegisterPage registerPage;

    @Given("User on login screen, tap button Daftar Sekarang")
    public void userOnLoginScreenTapButtonDaftarSekarang() {
        loginPage.onLoginScreen();
        loginPage.tapGoRegister();
    }


    @When("User On Register Screen")
    public void userOnRegisterScreen() {
        registerPage.onRegisterScreen();
    }

    @And("User input invalid Tanggal Lahir \\(beyond test date)")
    public void userInputInvalidTanggalLahirBeyondTestDate(String arg0) {
        registerPage.inputTanggalLahirInvalid();
    }

    @And("User ceklis checkbox Saya telah menyetujui kebijakan privasi yang berlaku")
    public void userCeklisCheckbox() {
        registerPage.clickCheckBox();
    }

    @And("User tap Button Daftar Sekarang")
    public void userTapButtonDaftarsekarang() {
        registerPage.clickButtonDaftarSekarang();
    }

    @Then("Number not include, because can{string}t be clicked and will automatically fill in the date of birth on the date of registration")
    public void numberNotIncludeBecauseCanTEnterTheDateOfBirthBecauseItCanTBeClickedAndWillAutomaticallyFillInTheDateOfBirthOnTheDateOfRegistration() {
        registerPage.inputTanggalLahirInvalid();
    }

    //TC_R2===============================================================
    @And("User input invalid Nama Depan {string} using number")
    public void userInputInvalidNamaDepanUsingNumber(String arg0) {
        registerPage.inputNamaDepan(arg0);
    }

    @And("User tap button Daftar-Sekarang")
    public void userTapbuttonn(String arg0) {
        registerPage.clickButtonDaftarSekarang();
    }

    @Then("Can not enter Nama Depan using number")
    public void canNotEnterNamaDepanUsingNumber() {
        registerPage.canNotEnterNamaDepan();
    }

    //TC_R3
    @And("User input invalid Nama Depan {string} using simbol")
    public void userInputInvalidNamaDepanUsingSimbol(String arg0) {
    }

    @And("User checklist checkbox {string}")
    public void userChecklistCheckbox(String arg0) {
    }

    @And("User tap button_Daftar-Sekarang")
    public void userTapButton_DaftarSekarang() {
    }

    @Then("Can not enter Nama_Depan using simbol")
    public void canNotEnterNama_DepanUsingSimbol() {
    }

    //TC_R4=============================================================
    @And("User input invalid data Nama Belakang {string} using number")
    public void userInputInvalidDataNamaBelakangUsingNumber(String arg0) {
    }

    @And("User ceklis checkbox {string}")
    public void userCeklisCheckbox(String arg0) {
        registerPage.clickCheckBox();
    }
    @And("User tap Daftar sekarang button")
    public void userTapDaftarSekarangButton() {
        registerPage.clickButtonDaftarSekarang();
    }
    @Then("Can not enter Nama Belakang using number")
    public void canNotEnterNamaBelakangUsingNumber() {
        registerPage.canNotEnterNamaBlekang();
    }

    //TC_R5=============================================================
    @And("User input invalid data Nama Belakang {string} using Simbol")
    public void userInputInvalidDataNamaBelakangUsingSimbol(String arg0) {
        registerPage.inputNamaBelakang(arg0);
    }
    @And("User ceklis checkboxx {string}")
    public void userCeklisCheckboxx(String arg0) {
        registerPage.clickCheckBox();
    }
    @Then("Can not enter Nama Belakang using simbols")
    public void canNotEnterNamaBelakangUsingSimbols() {
    }

    //TC_R6=============================================================
    @And("User input invalid Email, input invalid format {string}")
    public void userInputInvalidEmailInputInvalidFormat(String arg0) {
        registerPage.inputEmail(arg0);
    }

    @And("User Tap Button Daftar Sekarang")
    public void userTapButton(String arg0) {
        registerPage.clickButtonDaftarSekarang();
    }

    @Then("Show alert error invalid format email")
    public void showAlertError() {
        registerPage.showAlertInvalidFormatEmail();
    }

    //TC_R7=============================================================
    @And("User input valid Email, input valid format {string}")
    public void userInputInvalidEmailInputValidFormat(String arg0) {
        registerPage.inputEmail(arg0);
    }
    @And("User Tap Button Daftar Sekarangg")
    public void userTapButtonDaftarSekarangg() {
        registerPage.clickButtonDaftarSekarang();
    }
    @Then("Not show message error in field email")
    public void notShowMessageErrorInFieldEmail() {
        registerPage.notShowErrorInEmail();
    }

    //TC_R8=============================================================
    @And("User input invalid password only using lowercase {string}")
    public void userInputInvalidPasswordOnlyUsingLowercase(String arg0) {
        registerPage.inputPassword(arg0);
    }
    @And("User tap Daftar Sekarangg")
    public void userTappDaftarSekarang() {
        registerPage.clickButtonDaftarSekarang();
    }
    @Then("Show message \\(Harus ada menggunakan huruf capital dan nomor)")
    public void showMessageHarusAdaMenggunakanHurufCapitalDanNomor() {
        registerPage.showMessageInvalidPassword();
    }

    //TC_R11=============================================================
    @And("Tap button Batal")
    public void tapButtonBatal() {
        registerPage.clickButtonBatal();
    }
    @Then("User return to login page")
    public void userReturnToLoginPage() {
        boolean actual = loginPage.onLoginScreen();
        Assert.assertTrue(actual);
    }
}
