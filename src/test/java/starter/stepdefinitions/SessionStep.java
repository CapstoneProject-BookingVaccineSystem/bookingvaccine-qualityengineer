package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SessionStep {
        @Given("Admin on page login")
        public void onPageLogin(){};

        @When("^User input username \"([^\"]*)\" and password \"([^\"]*)\"$")
        public void userInputUnameAndPassword(String arg0, String arg1){}

        @And("Click button masuk")
        public void clickButtonMasuk(){}

        @And("Click menu Kelola Jadwal")
        public void clickMenuKelolaJadwal(){}

        @And("Click button Buat Jadwal$")
        public void clickButtonBuatJadwal(){}

        @And("Input Nama Fasilitas Kesehatan \"([^\"]*)\", Stock \"([^\"]*)\", Sesi \"([^\"]*)\", Alamat Lengkap\"([^\"]*)\", Link Google Map \"([^\"]*)\"$")
        public void inputFakesStockSesiAlamatLink(String arg0, String arg1, String arg2, String arg3, String arg4){}

        @And("Select RSUD")
        public void selectRSUD(){}

        @And("Upload gambar")
        public void uploadGambar(){}

        @And("Click button Simpan")
        public void clickButtonSimpan(){}

        @Then("Display Alert Success")
        public void displayAlertSuccess(){}
}
