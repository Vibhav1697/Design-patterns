import Decorator.ExtraCheese;
import Decorator.Mushroom;
import Pizza.BasePizza;
import Pizza.VegDelight;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new VegDelight();
        System.out.println("Cost of pizza is "+ pizza.getCost());
        pizza = new ExtraCheese(pizza);
        System.out.println("Cost of pizza with cheese is "+ pizza.getCost());

        pizza=new Mushroom(pizza);
        System.out.println("Cost of pizza with cheese and mushroom is "+ pizza.getCost());
    }
}