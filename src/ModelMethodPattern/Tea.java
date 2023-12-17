package ModelMethodPattern;

public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("brewing tea");
    }

    @Override
    void addCondiments() {
        System.out.println("add condiments for tea");
    }
}
