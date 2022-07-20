package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class BookingJadwalPage extends BasePageObject {
    private By bookingJadwal(){
        return MobileBy.xpath("\t\n" + "//android.view.View[@content-desc=\"Booking Jadwal Vaksinasi \"]");
    }

    private By namaKelurahan(){
        return MobileBy.xpath("\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
    }

//=========STEP============
    @Step
    public boolean onBookingJadwal(){
        return waitUntilPresence(bookingJadwal()).isDisplayed();
    }

    @Step
    public void inputNamaKelurahan(){
        onClick(namaKelurahan());
    }
}
