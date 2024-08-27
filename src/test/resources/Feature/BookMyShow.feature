Feature: BookMyShowApplication - Book Movies
Background: User Launch the application and click on movies
Given Launch the book my show application
And validate the application
Then User enters the City
And User Select the City
When User Click on movies

@Tamil
Scenario: Book a Tamil Movie
And User Select the Tamil language
Then User Validate the Tamil language
When User Select the Action Genre
And User Select the Format 3D
And User Select the Tamil Movie
@Telugu
Scenario: Book a Telugu Movie
And User Select the Telugu language
Then User Validate the Telugu language
When User Select the Action Genre
And User Select the Format 3D
And User Select the Telugu Movie
@newaccount
Scenario: Book a Malayalam Movie
And User Select the Malayalam language
Then User Validate the Malayalam language
When User Select the Action Genre
And User Select the Format 3D
And User Select the Mlayalam Movie

Scenario: Book a English Movie
And User Select the English language
Then User Validate the English language
When User Select the Action Genre
And User Select the Format 3D
And User Select the English Movie
