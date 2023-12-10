package FactoryPattern;

public class SichuanRawMaterialFactory implements RawMaterialFactory{
    @Override
    public Water createWater() {
        return new SichuanWater();
    }
}
