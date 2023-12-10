package DecoratePattern;

public class Soy extends CondimentDecorator{

    private final Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 34;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " soy";
    }
}
