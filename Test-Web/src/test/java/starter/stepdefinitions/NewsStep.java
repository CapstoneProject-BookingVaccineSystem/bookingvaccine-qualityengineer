package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsStep {
        @Given("Already Signin to website admin")
        public void siginToWebsiteAdmin(){}

        @When("Click menu Kelola berita")
        public void clickMenuKelolaBerita(){}

        @And("Click button Buat Berita")
        public void clickButtonBuatBerita(){}

        @And("Input field Judul berita \"([^\"]*)\", Author \"([^\"]*)\", and Isi Berita \"([^\"]*)\"$")
        public void inputFieldJudulAuthorIsi(String arg0, String arg1, String arg2){}

        @And("Upload photo gambar")
        public void uploadPhotoGambar(){}

        @And("Click button simpan")
        public void clickButtonSimpan(){}

        @Then("Show alert success Create News")
        public void alertButtonSimpan(){}

}
