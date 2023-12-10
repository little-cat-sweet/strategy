package FactoryPattern;

public class NYStyleCheesePizza extends Pizza{

    @Override
    void preparing() {

    }

    public NYStyleCheesePizza(String name, String dough, String sauce, RawMaterialFactory rawMaterialFactory){
        this.water = rawMaterialFactory.createWater();
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings.add("hot cheese");
    }
}
