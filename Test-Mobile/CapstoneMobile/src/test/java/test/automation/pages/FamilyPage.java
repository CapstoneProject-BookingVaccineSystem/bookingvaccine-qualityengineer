package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import test.automation.pageobject.BasePageObject;
import org.openqa.selenium.By;

public class FamilyPage extends BasePageObject {
    private By buttonTambahkan(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Tambahkan\"]");
    }

    private By fieldNIK(){
        return MobileBy.xpath("\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    }

    private By fieldNamaLengkap(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    }

    private By buttonSimpan(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Simpan\"]");
    }

//===============STEP==============
    @Step
    public void tapButtonTambahkan(){
        onClick(buttonTambahkan());
    }

    @Step
    public void tapButtonSimpan(){
        onClick(buttonSimpan());
    }

    @Step
    public void inputFieldNamaLengkap(String namaLengkap){
        onClick(fieldNamaLengkap());
        sendKeys(fieldNamaLengkap(), namaLengkap);
    }

    @Step
    public void inputFieldNIK(String nik){
        onClick(fieldNIK());
        sendKeys(fieldNIK(), nik);
    }

}
