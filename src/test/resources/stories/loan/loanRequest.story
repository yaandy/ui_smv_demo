Meta:

Narrative:
As a user
I want to ask for a loan of  at smava.de
So that I can make sure that loan ordering functionality works as expected

Scenario: Order loan using type "living" and different combination of ammount and month to pay
Meta: @smoke
Given The landing page is opened
When I set loan options order to: amount '2500', period '24 month'
And I click on next
Then The result page is completely loaded