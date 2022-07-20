Feature: Edit Informasi

    Background:
        Given User login input Nik and Passoword
        When On home screen, User tap button humberger
        And User tap menu "Profil" and go to profile screen
        And User tap button Edit Informasi

    Scenario Outline: User want edit information on profile screen (TC_P1)
        And User edit his email "<email>", NIK "<nik>" and no telp "<nomor>" with valid information
        And Tap simpan button
        Then Information has changed
        Examples:
            | email | nik | nomor |

    Scenario Outline: User want to edit information Email (TC_P2)
        And User edit Email with invalid format email "<invalidemail>"
        And Tap Simpan button
        Then Show alert error "Format harus berupa email"
        Examples:
            | invalidemail |

    Scenario Outline: User edits NIK information but enters NIK less than 16 digits (TC_P3)
        And User edit NIK "<invalidnik>" less than 16 digits
        And Tap Simpan Button
        Then Show alert error "NIK tidak kurang dari 16"
        Examples:
            | invalidnik |

    Scenario Outline: User want to change password in Edit Informasi Akun (TC_P4)
        And Tap "Ganti Password" button
        And  Input valid Password Lama "<validpass>", Password Baru "<newpass>", and Konfirmasi Password Baru "<konfirmasipass>"
        And Tap button Simpan in change password
        Then Show alert Success Change Password
        Examples:
            | validpass | newpass | konfirmasipass |








