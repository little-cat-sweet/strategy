package DecoratePattern;

public class Test {

    public static void main(String[] args) {

        Espresso espresso = new Espresso();
        HouseBlend houseBlend = new HouseBlend();

        Mocha mochaWithEspresso = new Mocha(espresso);
        Mocha mochaWithHouseBlend = new Mocha(houseBlend);

        Soy soyWithEspresso = new Soy(espresso);
        Soy soyWithHouseBlend = new Soy(houseBlend);

        System.out.println(mochaWithEspresso.getDescription());
        System.out.println("mochaWithEspresso cost" + mochaWithEspresso.cost());

        System.out.println(mochaWithHouseBlend.getDescription());
        System.out.println("mochaWithHouseBlend cost" + mochaWithHouseBlend.cost());

        System.out.println(soyWithEspresso.getDescription());
        System.out.println("soyWithEspresso cost" + soyWithEspresso.cost());

        System.out.println(soyWithHouseBlend.getDescription());
        System.out.println("soyWithHouseBlend cost" + soyWithHouseBlend.cost());
    }
}
