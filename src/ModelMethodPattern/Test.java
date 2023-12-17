package ModelMethodPattern;

public class Test{
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        tea.prepare();
        System.out.println("-------------");
        coffee.prepare();
    }
}
