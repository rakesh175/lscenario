Feature: Search for product

Scenario: search engine functionality

When open  browser1
And lauches TestMe App1
And Signin with valid user1
And search for product in search1 engine
And click on find products1
Then validate product is present1
