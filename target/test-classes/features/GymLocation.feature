Feature: GymLocation

  Scenario: Launch Webpage as a user who has not signed in and find location via Area name
#Launches the page> nuffieldhealth.com
    Given Homepage Is Launched
    #The Gym page leads to the location finder
    And User opens Gym page
    #The user input will be an Area name, this will load results which displays a 24/7 Membership option by default
    And User enters Location "Strabane_UK"

    Then Location for online gym displays

  Scenario: Sign in as a user and find the closest physical gym

#Goes to login page, attempts incorrect login and then correctly logs in
    When A user logs in

     #Upon successful login, checking for an element that appears in logged in page
    Then Confirm Logged In

    And Search for first gym via exact location

     #Upon completion of results and verifying then 24/7 option loads, we will get our browser to cheer for us *Hooray! :)*
    Then Logged in user has passed so load cheer button

