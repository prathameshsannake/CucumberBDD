#Feature: Login Page Automation of sauceDemo App
#
  #@smoke
  #Scenario Outline: Check login for locked_out_user
    #Given User is on Login page
    #When User enters Valid <Username> and <Password>
    #And Clicks on Login Button
    #Then Proper Error should be display for user
    #And Close the Browser
#
    #Examples: 
      #| Username        | Password     |
      #| locked_out_user | secret_sauce |
#
  #@Nagative2
  #Scenario Outline: Check login is with Invalid credentials
    #Given User is on Login page
    #When User enters InValid <Username> and <Password>
    #And Clicks on Login Button
    #Then Proper Error should be display for user
    #And Close the Browser
#
    #Examples: 
      #| Username      | Password    |
      #| standard_user | secret_sauc |
