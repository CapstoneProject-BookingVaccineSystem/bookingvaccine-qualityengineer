Feature: Booking

    Background :
        Given Admin on login_page
        When User input valid username "<username>" and password "<password>"
        And Click button "Masuk"

    Scenario: Admin can view detail booking vaccine user
        And On Dashboard click menu Detail Booking
        And Select one Nama on tabel
        And Show Detail Pemesanan
        Then Display Detail Pemesanan
