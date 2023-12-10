package FactoryPattern;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore siPizzaStore = new SichuanPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        Pizza pizza1 = siPizzaStore.orderPizza("cheese");

        System.out.println(pizza.display());
        Thread.sleep(1000);
        System.out.println(pizza1.display());

    }
}
