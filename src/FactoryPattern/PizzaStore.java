package FactoryPattern;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public final Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        pizza.preparing();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
