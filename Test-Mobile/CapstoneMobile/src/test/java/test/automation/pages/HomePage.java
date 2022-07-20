package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import test.automation.pageobject.BasePageObject;
import org.openqa.selenium.By;

public class HomePage extends BasePageObject {
    private By buttonHamberger(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }

    private By menuProfil(){
        return MobileBy.xpath("\t\n" + "//android.widget.ImageView[@content-desc=\"Profil\"]");
    }

    private By menuAnggotaKeluarga(){
        return MobileBy.xpath("\t\n" + "//android.widget.ImageView[@content-desc=\"Anggota keluarga\"]");
    }

    private By menuJadwalVaksinasi(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Jadwal Vaksinasi\"]");
    }

    private By menuRiwayatBooking(){
        return MobileBy.xpath("\t\n" + "//android.widget.ImageView[@content-desc=\"Riwayat Booking\"]");
    }

    private By menuKeluarAkun(){
        return MobileBy.xpath("\t\n" + "//android.widget.ImageView[@content-desc=\"Riwayat Booking\"]");
    }

    private By buttonDaftarSekarang(){
        return MobileBy.xpath("\t\n" + "//android.widget.ImageView[@content-desc=\"Daftar Sekarang!\"]");
    }

    private By ekslusifMiddleContent(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Eksklusif hanya untuk Anda! Ketahui berbagai fakta menarik tentang vaksin Covid-19 \"]");
    }

    private By buttonMiddleContent1(){
        return MobileBy.xpath("\t\n" + "(//android.widget.ImageView[@content-desc=\"Baca Selengkapnya\"])[1]");
    }

    private By buttonMiddleContent2(){
        return MobileBy.xpath("(//android.widget.ImageView[@content-desc=\"Baca Selengkapnya\"])[2]");
    }

//==========STEP============
    @Step
    public void tapButtonHumberger(){
        onClick(buttonHamberger());
    }

    @Step
    public void tapMenuProfile(){
        onClick(menuProfil());
    }

    @Step
    public void tapMenuAnggotaKeluarga(){
        onClick(menuAnggotaKeluarga());
    }

    @Step
    public void tapMenuJadwalVaksinasi(){
        onClick(menuJadwalVaksinasi());
    }

    @Step
    public void tapMenuRiwayatBooking(){
        onClick(menuRiwayatBooking());
    }

    @Step
    public void tapMenuKeluarAkun(){
        onClick(menuKeluarAkun());
    }

    @Step
    public void tapButtonDaftarSekarang(){
        onClick(buttonDaftarSekarang());
    }

    @Step
    public void tapButtonMiddleContent1(){
        onClick(buttonMiddleContent1());
    }

    @Step
    public void tapButtonMiddleContent2(){
        onClick(buttonMiddleContent2());
    }

    @Step
    public boolean onHomeScreen(){
        return waitUntilVisible(ekslusifMiddleContent()).isDisplayed();
    }

}
