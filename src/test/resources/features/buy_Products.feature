@buy_Products
Feature: Test Shopping Cart

  Scenario: Adds 2 products
    Given Francisco navigates mainly to the main page
    When Step select first product and add to cart
    When Step return main page
    When Step select second product and add to cart
    When Step visualize cart
    When Step display order
    When Step fill form "Francisco Riofrio", "Ecuador", "Cuenca", "1104061278001", "08", "2023"
    Then Step validate message "Thank you for your purchase!"