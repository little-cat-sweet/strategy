package AdapterPattern;

public class Main {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("turkey : ");
        wildTurkey.gobble();

        System.out.println("duck : ");
        mallardDuck.quack();

        System.out.println("turkeyAdapter(duck) : ");
        turkeyAdapter.quack();
    }
}
