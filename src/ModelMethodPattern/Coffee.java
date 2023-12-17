package ModelMethodPattern;

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("add condiments for coffee");
    }
}
