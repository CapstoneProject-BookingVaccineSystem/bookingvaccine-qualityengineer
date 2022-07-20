Feature: Family

    Background:
        Given User login to the application with input nik "<nik>" and password "<password>"
        When On Home Screen User tap button humberger
        And User tap menu "Anggota Keluarga"

        Scenario Outline: User want to add their family member (TC_F1)
            And user tap button "Tambahkan"
            And User input valid NIK "<validnik>" in field NIK
            And User input field Nama Lengkap "<namalengkap>"
            And tap button Tambahkan
            Then Family Member has added
            Examples:
                | validnik | namalengkap |

        Scenario: User want to check family member (TC_F2)
            And user tap button "Keluarga 1"
            Then Display information about NIK and Nama Lengkap

        Scenario Outline: User want to edit Name Anggota Keluarga (TC_F3)
            And Tap List Keluarga 1
            And Tap button Ubah
            And Change Name "<name>"
            And Tap Simpan
            Then Show Message Success "Data Berhasil Diubah"
            Examples:
                | name |

        Scenario Outline: User want to edit NIK Anggota Keluarga with valid NIK (TC_F4)
            And Tap List Keluarga 2
            And Tap button "Ubah"
            And Change valid NIK "<validnik>"
            And Tap Simpan Button
            Then Show Message Success "Data Berhasil Diubah" and data changed
            Examples:
                | validnik |

        Scenario: User want to edit NIK Anggota Keluarga with invalid NIK (TC_F5)
            And Tap List Keluarga "2"
            And Tap button ubah
            And Remove NIK until less than 16 digits
            And Tap button Simpan
            Then Show Message Error "NIK Tidak boleh kurang dari 16"

        Scenario: User want to delete family member (TC_F6)
            And Tap List keluarga 2
            And Tap button Hapus
            And Tap Konfirmasi
            Then Data Keluarga deleted




