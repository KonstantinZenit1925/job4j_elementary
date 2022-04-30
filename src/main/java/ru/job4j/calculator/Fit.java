package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl;
        rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl1;
        rsl1 = (height - 110) * 1.15;
        return rsl1;
    }

    public static void main(String[] args) {
        short height = 187;
        short height2 = 165;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height2);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 165 is " + woman);

    }
}
