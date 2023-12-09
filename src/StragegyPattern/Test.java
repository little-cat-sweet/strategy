package StragegyPattern;

public class Test {

    public static void main(String[] args) {
        HappyDock happyDock = new HappyDock();
        happyDock.display();
        happyDock.performFly();
        happyDock.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        //set new fly method for model dock.
        modelDuck.setFlyBehavior(new FlyRocketPower());
        modelDuck.performFly();
    }
}
