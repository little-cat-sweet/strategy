package FactoryPattern;

public class SichuanStyleCheesePizza extends Pizza{

    public SichuanStyleCheesePizza(String name, String dough, String sauce, RawMaterialFactory rawMaterialFactory) {
        this.water = rawMaterialFactory.createWater();
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings.add("little cheese");
    }

    @Override
    void preparing() {

    }
}
