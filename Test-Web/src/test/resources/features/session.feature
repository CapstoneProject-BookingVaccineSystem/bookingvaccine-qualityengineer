Feature: Session

    Background :
        Given Admin on page login
        When User input username "<username>" and password "<password>"
        And Click button masuk
        And Click menu Kelola Jadwal

    Scenario Outline: Admin want create session vaccine for RSUD
        And Click button Buat Jadwal
        And Input Nama Fasilitas Kesehatan "<fakes>", Stock "<stock>", Sesi "<sesi>", Alamat Lengkap"<alamat>", Link Google Map "<link>"
        And Select RSUD
        And Upload gambar
        And Click button Simpan
        Then Display Alert Success
        Examples:
            |fakes|stock|sesi|alamat|link|



