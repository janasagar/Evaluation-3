@tag
Feature: Makemytrip hotel booking

  @tag1
  Scenario: Search and book book a hotel
    Given User visited to mackmytrip website
    When User select hotel
    And User Enter location, date, rooms, guests, price per night  
    And User click on search button 
    Then Hotels should be displayed
    And User list the hotel names
    And User filter the result with breakfast included, rating, room view
    And User select Blanket Hotel & spa Munnar
    And User Swicth to child tab
    And User click on Book now button
    And User enter Guest details
    And User click on pay now button
    Then User Should redirect to chackout page, close the browser
