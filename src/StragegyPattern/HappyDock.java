package StragegyPattern;

public class HappyDock extends Duck{

    public HappyDock(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am happy dock ~");
    }
}
