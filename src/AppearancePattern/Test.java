package AppearancePattern;

public class Test {

    public static void main(String[] args) {

        Controller controller = new Controller(new Computer(), new Light(), new Water());
        controller.sleep();
    }
}
