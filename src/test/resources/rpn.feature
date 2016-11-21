Feature:To check RPN calculator functionalities as a user I should be able to calculate
Scenario:Adding two numbers
Given Two numbers followed by '+' operator.
When 2 3 + are added
Then result should be 5


Scenario:Donot accept alphabet
Given Any alphabet as input
When they are entered
Then Resulting error message "alphabet not allowed"