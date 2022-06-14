Feature: Manage User

    Scenario: Verify Admin can view User
        Given Admin login and show dashboard
        When Admin click menu Kelola Pengguna
        And Admin click icon view in table user
        Then Show data User


