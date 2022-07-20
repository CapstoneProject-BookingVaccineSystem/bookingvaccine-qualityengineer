package test.automation.pages;

import io.appium.java_client.MobileBy;
import test.automation.pageobject.BasePageObject;
import org.openqa.selenium.By;
import net.thucydides.core.annotations.Step;


public class LoginPage extends BasePageObject{
    private By loginScreen(){return MobileBy.xpath("//android.view.View[@content-desc=\"Halo! Selamat Datang Kembali!\"]");}
    private By goRegister(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Daftar Sekarang\"]");
    }
    private By buttonMasuk(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Masuk\"]");
    }

    private By fieldNIK(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By fieldPassword(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }


    private By passwordTidakBolehKosong(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Password tidak boleh kosong\"]");
    }
    private By nikTidakBolehKosong(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Nik tidak boleh kosong\"]");
    }
    private By nikAtauPasswordSalah(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Nik Atau Password Salah\"]");
    }

    private By iconEye(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]/android.widget.ImageView");
    }

//===================Step=============================

    @Step
    public boolean onLoginScreen(){
        return waitUntilPresence(loginScreen()).isDisplayed();
    }

    @Step
    public void tapGoRegister(){
        onClick(goRegister());
    }
    @Step
    public void tapButtonMasuk(){
        onClick(buttonMasuk());
    }


    @Step
    public void inputFieldNIK(String nik) throws InterruptedException {
        Thread.sleep(15000);
        onClick(fieldNIK());
        sendKeys(fieldNIK(), nik);
    }
    @Step
    public void inputFieldPassword(String pwd) throws InterruptedException {
        Thread.sleep(15000);
        onClick(fieldPassword());
        sendKeys(fieldPassword(), pwd);
    }

    @Step
    public boolean alertNikAtauPasswordSalah(){
        return waitUntilVisible(nikAtauPasswordSalah()).isDisplayed();
    }

    @Step
    public boolean tapMasukFailed(){
        waitUntilVisible(nikTidakBolehKosong()).isDisplayed();
       return waitUntilVisible(passwordTidakBolehKosong()).isDisplayed();
    }

    @Step
    public boolean messageNIKTidakBolehKosong(){
        return waitUntilVisible(nikTidakBolehKosong()).isDisplayed();
    }

    @Step
    public boolean messagePasswordTidakBolehKosong(){
        return waitUntilVisible(passwordTidakBolehKosong()).isDisplayed();
    }



}
