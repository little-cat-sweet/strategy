package FactoryPattern;

public class NYStyleClamPizza extends Pizza{

    public NYStyleClamPizza(String name, String dough, String sauce, RawMaterialFactory rawMaterialFactory) {
        this.water = rawMaterialFactory.createWater();
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings.add("hot cheese");
    }

    @Override
    void preparing() {

    }
}
