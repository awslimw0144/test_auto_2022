Feature: Get list of latest movies

  Background:
    Given John goes to imdb

  Scenario Outline: based on first latest date
    When John attempts to view the <MOVIE_CATEGORY>
#    And he checks for the upcoming releases for <COUNTRY>
#    Then he should be able to see the list of movies that are happening on the most latest date
    Examples:
      | MOVIE_CATEGORY   | COUNTRY       |
      | Release Calendar | United States |