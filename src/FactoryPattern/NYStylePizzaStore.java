package FactoryPattern;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza("NYStyleCheesePizza",
                    "Thin Crust Dough",
                    "Super sauce", new SichuanRawMaterialFactory());
        }else if(type.equals("clam")){
            return new NYStyleClamPizza("NYStyleClamPizza",
                    "Thin Crust Dough",
                    "Super sauce", new SichuanRawMaterialFactory());
        }
        return null;
    }
}
