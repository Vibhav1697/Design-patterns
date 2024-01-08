package Decorator;

import Decorator.PizzaDecorator;
import Pizza.BasePizza;

public class Mushroom extends PizzaDecorator {
    BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost()+4;
    }
}
