@login
Feature: Login

    Background:
        Given User on Login Screen

    @invalid-login1
    Scenario: Verify if the user can't login with invalid NIK (TC_L1)
        When User input invalid NIK "0000000000000016"
        And User input valid Password "Password123"
        And User tap (Masuk) button
        Then Show message error "NIK Atau Password Salah"

    @invalid-login2
    Scenario Outline: Verify if the user can't login with invalid Password (TC_L2)
        When User input valid NIK "<validnik>"
        And User input invalid Password "<invalidpwd>"
        And User tap button Masuk
        Then Show error message (NIK atau Password Salah)
        Examples:
            | validnik | invalidpwd |
            | 6161616164949494 | passwordinvalid |

    @invalid-login3
    Scenario: Verify if the user can login with empty Nik and Password (TC_L3)
        When User tap button (MASUK)
        Then Show error message

    @invalid-login4
    Scenario: Verify if the user can't login with empty NIK (TC_L4)
        When User tap and type password "password123"
        And Click button masuk
        Then Show message error NIK tidak boleh kosong

    @invalid-login5
    Scenario: Verify if the user can't login with empty Password (TC_L5)
        When User tap and type NIK
        And Tap MasukButton
        Then Show Error Message PASSWORD TIDAK BOLEH KOSONG

    @valid-login
    Scenario: Verify if the user can login with valid Nik and Password (TC_L6)
        When User input valid NIK "6161616164949494" and Password "Password123"
        And Tap button masuk
        Then User go to home screen







