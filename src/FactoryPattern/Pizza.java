package FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    Water water;

    public String getName() {
        return name;
    }
    abstract void preparing();
    void bake(){
        System.out.println(name + "is baking");
    }
    void cut() {
        System.out.println(name + "is cutting");
    }
    void box(){
        System.out.println(name + "is boxing");
    }

    String display(){
        return "here is the " + this.name;
    }

}
