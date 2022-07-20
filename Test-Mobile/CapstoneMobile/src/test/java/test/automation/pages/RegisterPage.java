package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import test.automation.pageobject.BasePageObject;
import org.openqa.selenium.By;

public class RegisterPage extends BasePageObject {
    private By registerScreen(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Silahkan Buat Akun Anda\"]");
    }

    private By fieldNamaDepan(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    }

    private By fieldNamaBelakang(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    }

    private By fieldTanggalLahir(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[5]");
    }
    private By selectYear(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Select year\"]");
    }

    private By fieldJenisKelamin(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Pilih Jenis Kelamin\"]");
    }
     private By fieldJKlaki(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Laki-Laki\"]");
     }
     private By fieldJKPerempuan(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Perempuan\"]");
     }

     private By fieldEmail(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");
     }

     private By fieldPassword(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]");
     }

     private By iconEyePwd(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]/android.view.View");
     }

     private By fieldNIK(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]");
     }

     private By fieldTelpon(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[6]");
     }

     private By checkBox(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox");
     }

     private By checkBoxRed(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox");
     }

     private By buttonDaftarSekarang(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Daftar Sekarang\"]");
     }

     private By buttonBatal(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Batal\"]");
     }

     private By nomorTelponTidakBolehKosong(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Nomor telpon tidak boleh kosong\"]");
     }
     private By nikTidakBolehKosong(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"NIK tidak boleh kosong\"]");
     }
     private By passwordTidakBolehKosong(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Password tidak boleh kosong\"]");
     }
     private By emailTidakBolehKosong(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Email tidak boleh kosong\"]");
     }
     private By jenisKelaminTidakBolehKosong(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Jenis kelamin tidak boleh kosong\"]");
     }
     private By tanggalLahirTidakBolehKosong(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Tanggal lahir tidak boleh kosong\"]");
     }
     private By namaBelakangTidakBolehKosong(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Nama belakang tidak boleh kosong\"]");
     }
     private By namaDepanTidakBolehKosong(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Nama depan tidak boleh kosong\"]");
     }
     private By formatHarusBerupaEmail(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Format harus berupa email\"]");
     }

     private By tanggalBeyoundDate(){
        return MobileBy.xpath("\t\n" +
            "//android.view.View[@content-desc=\"SELECT DATE Tue, Jul 12\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[37]");
     }

     private By selectYear2000(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"2000\"]");
     }
     private By select20Juli(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"20, Thursday, July 20, 2000\"]");
     }
     private By selectOkDate(){
        return MobileBy.xpath("\t\n" + "//android.widget.Button[@content-desc=\"OK\"]");
     }

     private By messageInvalidPassword(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Harus ada menggunakan huruf capital dan nomor\"]");
     }

//==================STEP==================
    @Step
    public boolean onRegisterScreen(){
        return waitUntilPresence(registerScreen()).isDisplayed();
    }

    @Step
    public void inputNamaDepan(String namaDepan){
        onClick(fieldNamaDepan());
        sendKeys(fieldNamaBelakang(), namaDepan);
    }

    @Step
    public void inputNamaBelakang(String namaBelakang){
        onClick(fieldNamaDepan());
        sendKeys(fieldNamaBelakang(), namaBelakang);
    }

    @Step
    public void inputTanggalLahirValid(){
        onClick(fieldTanggalLahir());
        onClick(selectYear());
        onClick(selectYear2000());
        onClick(select20Juli());
        onClick(selectOkDate());
    }

    @Step
    public void inputTanggalLahirInvalid(){
        onClick(selectYear());
        onClick(tanggalBeyoundDate());
        onClick(selectOkDate());
    }

    @Step
    public void inputJenisKelamin(){
        onClick(fieldJenisKelamin());
        onClick(fieldJKlaki());
    }

    @Step
    public void inputEmail(String email){
        onClick(fieldEmail());
        sendKeys(fieldEmail(), email);
    }

    @Step
    public void inputPassword(String pwd){
        onClick(fieldPassword());
        sendKeys(fieldPassword(), pwd);
    }

    @Step
    public void clickEyePassword(){
        onClick(iconEyePwd());
    }

    @Step
    public void inputNik(String nik){
        onClick(fieldNIK());
        sendKeys(fieldNIK(), nik);
    }

    @Step
    public void inputTelpon(String telpon){
        onClick(fieldTelpon());
        sendKeys(fieldTelpon(), telpon);
    }

    @Step
    public void clickCheckBox(){
        onClick(checkBox());
    }

    @Step
    public boolean visibleCheckboxRed(){
        return waitUntilVisible(checkBoxRed()).isDisplayed();
    }

    @Step
    public void clickButtonDaftarSekarang(){
        onClick(buttonDaftarSekarang());
    }

    @Step
    public void clickButtonBatal(){
        onClick(buttonBatal());
    }


    @Step
    public boolean canNotEnterNamaDepan(){
        waitUntilPresence(passwordTidakBolehKosong()).isDisplayed();
        waitUntilPresence(tanggalLahirTidakBolehKosong()).isDisplayed();
        waitUntilPresence(namaBelakangTidakBolehKosong()).isDisplayed();
        return waitUntilPresence(jenisKelaminTidakBolehKosong()).isDisplayed();
    }

    @Step
    public boolean canNotEnterNamaBlekang(){
        waitUntilVisible(passwordTidakBolehKosong()).isDisplayed();
        waitUntilVisible(tanggalLahirTidakBolehKosong()).isDisplayed();
        waitUntilVisible(namaDepanTidakBolehKosong()).isDisplayed();
        return waitUntilPresence(jenisKelaminTidakBolehKosong()).isDisplayed();
    }

    @Step
    public boolean showAlertInvalidFormatEmail(){
        return waitUntilPresence(formatHarusBerupaEmail()).isDisplayed();
    }

    @Step
    public boolean showMessageInvalidPassword(){
        return waitUntilPresence(messageInvalidPassword()).isDisplayed();
    }

    @Step
    public boolean notShowErrorInEmail(){
        waitUntilVisible(passwordTidakBolehKosong()).isDisplayed();
        waitUntilVisible(tanggalLahirTidakBolehKosong()).isDisplayed();
        waitUntilVisible(namaDepanTidakBolehKosong()).isDisplayed();
        waitUntilVisible(namaBelakangTidakBolehKosong()).isDisplayed();
        waitUntilVisible(nikTidakBolehKosong()).isDisplayed();
        return waitUntilPresence(jenisKelaminTidakBolehKosong()).isDisplayed();
    }



}
