Feature: Login

    Scenario Outline: Verification user admin can't login to the website
        Given Admin on login page
        When Admin input Invalid Username "<uname>" on username field
        And Input valid password "<pwd>" on password field
        And Click button Masuk
        Then Show Alert Error
        Examples:
            |uname|pwd|



