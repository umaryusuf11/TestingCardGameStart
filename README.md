# TestingCardGameStart
## Setup
* See if not done from the last lab [https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/setup](https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/setup)
* Fork [TestingCardGameStart](https://stgit.dcs.gla.ac.uk/DerekSomerville/testingcardgamestart) see [https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/Git/Project_Setup](https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/Git/Project_Setup)
* Make sure you have invited Derek Somerville and your tutor as Developer Members

## Overview
* We will create unit tests for all functions returning a value

## Already Done
* Look at src/test/HandTest.java to see some test already completed
* Run the tests

## Player Tests
* Please create unit tests for the Player Class
* Open Player Class, click on it, "Shift + Cntrl + t" to create default unit tests
* Select the following methods:
  * hasWon
  * getPlayerType
  * hasHand
  * getHand
* Write unit tests for each of the methods to check they work

## Card Game
* Please create unit tests for the CardGame Class
* Open CardGame Class, click on it, "Shift + Cntrl + t" to create default unit tests
* Select the following methods:
  * getDeck
  * dealHand - note there is an override constructor to create a card game with a deck of cards

## BlackJack
* Please create unit tests for the BlackJack Class
* Open BlackJack Class, click on it, "Shift + Cntrl + t" to create default unit tests
* Select the following methods:
  * getScore
    * getScoreAceHigh - Score where an Ace is high e.g. not bust
    * getScoreAceLow - Score where the Ace is low, so bust if Ace is high
    * getScoreFive - Score with five cards
  * determineWinner - Note you need to setup the players, hands and assign. The input is a list of players 

## Submit
* Before you commit you final solution, double check it can build and all the test you completed can run.
* Go to the Week four folder and open the assessment
* In text paste the https .git for the forked project
* Zip the project and submit