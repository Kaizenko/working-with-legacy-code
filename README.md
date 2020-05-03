# working-with-legacy-code
Strater exercises for refactoring and testing existing code. Adapted from https://github.com/emilybache/Racing-Car-Katas.

Assume we want to add new functionality to code that does not have any tests. 
So first we need to add tests before adding the functionality. How easy is it to add tests? What principles might we be violating?

Let's refactor the code to make it cleaner. Remember that before refactoring, we need to have a test to lean on. Also when refacotring,
we cannot break exisitng calls to our api from other code (assume that there are other componenets not in this repo that call our code)

TirePressureMonitoringSystem exercise: write the unit tests for the Alarm class. The Alarm class is designed to monitor tire pressure and set an alarm if the pressure falls outside of the expected range. The Sensor class provided for the exercise fakes the behaviour of a real tire sensor, providing random but realistic values.

TicketDispenser exercise: write the unit tests for the TicketDispenser. The TicketDispenser class is designed to be used to manage a queuing system in a shop. There may be more than one ticket dispenser but the same ticket should not be issued to two different customers.

