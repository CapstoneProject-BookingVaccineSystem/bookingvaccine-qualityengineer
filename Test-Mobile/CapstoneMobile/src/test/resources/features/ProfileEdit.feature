Feature: Edit Profil

    Background:
        Given User login input valid NIK "<NIK>" and PASSWORD "<PASSWORD>"
        When On home screen, User tap button humbergerr
        And User tap menu Profil and go to profile screen
        And User tap button "Edit Profil"


    Scenario Outline: User want to edit Profile on profile screen (TC_P5)
        And User edit his Nama Depan "<namadepanedit>" dan Nama Belakang "<namabelakangedit>"
        And Tap button Simpan
        Then Nama Depan and Nama belakang in Profile has changed
        Examples:
            | namadepanedit | namabelakangedit |

    Scenario Outline: User want to edit Profile "Nama Depan" and "Nama Belakang with invalid data (TC_P6)
        And User edit Nama depan "<invalidnamadepan>" with add number
        And Tap button Simpan
        Then Nama Depan and Nama belakang don't change because it can't add numbers
        Examples:
            | invalidnamadepan |

    Scenario: User want to edit Profile "Tanggal Lahir" on profile screen (TC_P7)
        And User edit Tanggl Lahir (beyond test date)
        And Tap Button Simpan
        Then The date of birth will change to the date when it was edited

    Scenario Outline: verify user can't change password in Edit Informasi Akun (TC_P8)
        And Tap ganti password button
        And Input valid Password Lama "<validpasswordlama>"
        And Input invalid Password Baru, and Konfirmasi Password Baru "<invalidpasswordbaru>"
        And Tap button Simpan on Ganti Password
        Then Show alert error Harus ada menggunakan huruf capital dan nomor
        Examples:
            | validpasswordlama | invalidpasswordbaru |

    Scenario Outline: User verification cannot change password in Edit Account Information because New Password with Confirm Password is different
        And Tap ""Ganti Password"" button
        And Input valid Password Lama "<validpwdlama>"
        And Input valid Password Baru "<validpwdbaru>"
        And Enter Confirm New Password is different from New Password "<differentpwdbaru>"
        And Tap button "Simpan" on Ganti Password
        Then Show alert error in Password Baru "Konfirmasi password berbeda dengan password baru"
        Examples:
            | validpwdlama | validpwdbaru | differentpwdbaru |


