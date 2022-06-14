Feature: News
    Background:
        Given Already Signin to website admin
        When Click menu Kelola berita

    Scenario Outline: Admin want to create news
        And Click button Buat Berita
        And Input field Judul berita "<judul>", Author "<author>", and Isi Berita "<isi>"
        And Upload photo/gambar
        And Click button simpan
        Then Show alert success Create News
        Examples:
            |judul|author|isi|

