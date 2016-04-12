Feature:  Google Stuff
  As an User
  I want to google stuff.

  Scenario: Google Stuff
    Given the user is on Googles Home Page
    When  the user types into the searchbar Stuff
    And   he clicks on the search-button
    Then  the search results are shown
