package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inRuble = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(inRuble);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inDollar = 120;
        float expected2 = 2;
        float out2 = Converter.rubleToDollar(inDollar);
        boolean passed2 = expected2 == out2;
        System.out.println("120 dollars are 2. Test result : " + passed2);

    }
}
