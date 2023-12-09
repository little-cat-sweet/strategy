package StragegyPattern;

public class ModelDuck extends Duck{

    public ModelDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am model dock");
    }
}
