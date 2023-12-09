package StragegyPattern;

public class FlyWithNoWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("fling with no wings.");
    }
}
