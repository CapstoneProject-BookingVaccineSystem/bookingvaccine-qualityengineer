@Register
Feature: Register

    Background:
        Given User on login screen, tap button Daftar Sekarang
        When User On Register Screen

# Tanggal Lahir tidak bisa diautomation
#        Scenario: Verify if a user can't Register with a invalid Data Tanggal Lahir (TC_R1)
#            And User input invalid Tanggal Lahir (beyond test date)
#            And User ceklis checkbox Saya telah menyetujui kebijakan privasi yang berlaku
#            And User tap Button Daftar Sekarang
#            Then Number not include, because cant enter the date of birth because it cant be clicked and will automatically fill in the date of birth on the date of registration


        Scenario Outline: Verify if a user can't Register with a invalid Data Nama Depan with number (TC_R2)
            And User input invalid Nama Depan "<namadepan>" using number
            And User ceklis checkbox "Saya telah menyetujui kebijakan privasi yang berlaku"
            And User tap button Daftar-Sekarang
            Then Can not enter Nama Depan using number
            Examples:
                | namadepan |
                | Riko6     |

        Scenario Outline: Verify if a user can't Register with a invalid Data Nama Depan with simbol (TC_R3)
            And User input invalid Nama Depan "<namadepan>" using simbol
            And User checklist checkbox "Saya telah menyetujui kebijakan privasi yang berlaku"
            And User tap button_Daftar-Sekarang
            Then Can not enter Nama_Depan using simbol
            Examples:
                | namadepan |
                | Riko@#$     |

        Scenario Outline: Verify if a user can't Register with a invalid Data Nama Belakang using number (TC_R4)
            And User input invalid data Nama Belakang "<namabelakang>" using number
            And User ceklis checkbox "Saya telah menyetujui kebijakan privasi yang berlaku"
            And User tap Daftar sekarang button
            Then Can not enter Nama Belakang using number
            Examples:
                | namabelakang |
                | Sahetapi11   |

        Scenario Outline: Verify if a user can't Register with a invalid Data Nama Belakang using Simbol (TC_R5)
            And User input invalid data Nama Belakang "<namabelakang>" using Simbol
            And User ceklis checkboxx "Saya telah menyetujui kebijakan privasi yang berlaku"
            And User tap Daftar sekarang button
            Then Can not enter Nama Belakang using simbols
            Examples:
                | namabelakang |
                | Sahetapi11   |

        Scenario Outline: Verify if a user can't Register with a invalid Data Format Email (TC_R6)
            And User input invalid Email, input invalid format "<invalidemailformat>"
            And User Tap Button Daftar Sekarang
            Then Show alert error invalid format email
            Examples:
                | invalidemailformat |
                | rikoinvalid        |

        Scenario Outline: Verify if a user can't Register with a valid Data Format Email (TC_R7)
            And User input valid Email, input valid format "<validemailformat>"
            And User Tap Button Daftar Sekarangg
            Then Not show message error in field email
            Examples:
                | validemailformat |
                | rikovalid@email.com        |

        Scenario Outline: Verify if a user can't Register with a invalid Data Password only lowercase (TC_R8)
            And User input invalid password only using lowercase "<invalidpassword>"
            And User tap Daftar Sekarangg
            Then Show message (Harus ada menggunakan huruf capital dan nomor)
            Examples:
                | invalidpassword |
                | invalidpasswordhanyalowercase |


    # Tanggal Lahir tidak bisa diautomation, jadi scenario ini tidak bisa dijalankan
#        Scenario Outline: Verify if the users can't Register if he doesn't check the checkbox after input valid data (TC_R6)
#            And User input valid all data Nama Depan "<namadepanvalid>", Nama Belakang "<namabelakangvalid>", Tanggal Lahir, Jenis Kelamin "<jeniskelamin>", Email "<email>", Password "<validpasswo>", NIK "<nik>", Nomor Telfon "<telp>"
#            And User tap Button Daftar Sekarang
#            Then the checkbox changes color to red and failed to register
#            Examples:
#                | namadepanvalid | namabelakangvalid | jeniskelamin | email | validpasswo | nik | telp |
#                | Riko           | Sahetapi          | Laki-laki    | rikoshtp@gmail.com    | Password611 |1234567823456345 | 0895321755345 |


    # Tanggal Lahir tidak bisa diautomation, jadi scenario ini tidak bisa dijalankan
#        Scenario Outline: Verify if the user can register his account with valid data (TC_R7)
#            And User input valid all data Nama Depan "<namadepanvalid>", Nama Belakang "<namabelakangvalid>", Tanggal Lahir, Jenis Kelamin, Email "<email>", Password "<validpassword>", NIK "<nik>", No.Telfon "<telp>"
#            And Tap CheckBox
#            And User tap button Daftar_Sekarang
#            Then Display Message Success Register and User go to login screen
#            Examples:
#                | namadepanvalid | namabelakangvalid | jeniskelamin | email | validpassword | nik | telp |
#                | Riko           | Sahetapi          | Laki-laki    | rikoshtp@gmail.com    | Password611 |1234567823456345 | 0895321755345 |


        Scenario: Verification "batal" in Register Page can be used (TC_R11)
            And Tap button Batal
            Then User return to login page


