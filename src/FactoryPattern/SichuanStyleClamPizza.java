package FactoryPattern;

public class SichuanStyleClamPizza extends Pizza{
    public SichuanStyleClamPizza(String name, String dough, String sauce, RawMaterialFactory rawMaterialFactory) {
        this.water = rawMaterialFactory.createWater();
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings.add("sichuan 麻婆 taboo");
    }

    @Override
    void preparing() {

    }
}
