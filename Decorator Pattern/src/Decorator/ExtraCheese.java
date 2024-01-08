package Decorator;

import Decorator.PizzaDecorator;
import Pizza.BasePizza;

public class ExtraCheese extends PizzaDecorator {

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 2;
    }
}
