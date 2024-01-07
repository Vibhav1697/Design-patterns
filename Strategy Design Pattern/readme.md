Strategy Design Pattern.

Its used to remove duplicacy of code

Suppose parent class with a method  has three child classes and two of them are using the same implementation of the method, then there is a code duplicacy.

To remove this duplicacy, we create a strategy(an interface and various strategies implementing that interface) for that method and inject the strategy in the parent class as constructor injection.

now child class can call the parent class with their respective strategy.