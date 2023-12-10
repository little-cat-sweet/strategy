package DecoratePattern;

public class Mocha extends CondimentDecorator{

    private final Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 23;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }
}
