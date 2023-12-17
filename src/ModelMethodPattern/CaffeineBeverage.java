package ModelMethodPattern;

public abstract class CaffeineBeverage {

    final void prepare(){
        boilWater();
        brew();
        pourInCup();
        if(needAddCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
    boolean needAddCondiments(){
        return true;
    }
}
