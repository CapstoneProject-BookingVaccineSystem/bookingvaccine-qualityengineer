Feature: Home

    Background:
        Given User login into the app with nik "<nik>" and password "<pwd>"
        When Users on the home screen

    Scenario: Verify that the components on the home screen are displayed (TC_H1)
        Then Display the existing components (Header, Content, Ekslusif content, news)

    Scenario: User want see menu in side bar (TC_H2)
        And The user tap on the hamburger menu on the top left side of the screen
        Then Show list menu

    Scenario: User wants to booking vaccine (TC_H3)
        And User tap button "Daftar Sekarang!"
        And User select location vaccine
        And User tap button "Pilih"
        And User tap button "Booking Sekarang"
        Then User direct to invoce page and tap button to go to home page

    Scenario: User want to "Baca Selengkapnya" section "Cara pencegahan virus covid-19" on ekslusif hanya untuk Anda (TC_H4)
        And User Click button "Baca Selengkapnya" on ekslusif "Berbagai macam vaksin"
        Then Show screen "Berbagai macam jenis vaksin Covid-19 yang ada di Indonesia"

    Scenario: User want to "Baca Selengkapnya" section "Cara pencegahan virus covid-19" on ekslusif hanya untuk Anda (TC_H5)
        And User on home screen and click button "Baca Selengkapnya" on ekslusif "Cara pencegahan virus..."
        Then Show Screen "Cara Pencegahan virus Covid-19 dan Gejala Penyakitnya"

    Scenario: User want to see more "Berita Terbaru" from home page (TC_H6)
        And User direct to screen Berita Terbaru
        And User select 1 news and go to reading article
        Then The application displays articles based on the selected

    Scenario: User want to logout account (TC_H7)
        And User tap humberger icon to open sidebar
        And Tap Keluar Akun
        Then Go to login page




