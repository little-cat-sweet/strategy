package AppearancePattern;

public class Controller {

    Computer computer;
    Light light;
    Water water;

    public Controller(Computer computer, Light light, Water water) {
        this.computer = computer;
        this.light = light;
        this.water = water;
    }

    public void sleep(){
        this.water.drink();
        this.computer.off();
        this.light.off();
    }
}
