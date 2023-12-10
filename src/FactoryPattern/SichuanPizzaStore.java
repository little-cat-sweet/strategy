package FactoryPattern;

public class SichuanPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new SichuanStyleCheesePizza("SichuanStyleCheesePizza",
                    "Thin Crust Dough",
                    "Super sauce", new SichuanRawMaterialFactory());
        }else if(type.equals("clam")){
            return new SichuanStyleClamPizza("SichuanStyleClamPizza",
                    "Thin Crust Dough",
                    "Super sauce", new SichuanRawMaterialFactory());
        }
        return null;
    }
}
