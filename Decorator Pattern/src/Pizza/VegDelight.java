package Pizza;

import Pizza.BasePizza;

public class VegDelight implements BasePizza {
    @Override
    public int getCost() {
        return 100;
    }
}
