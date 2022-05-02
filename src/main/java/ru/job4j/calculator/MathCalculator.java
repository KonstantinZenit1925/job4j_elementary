package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double allOperations(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + difference(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета метода сумма и произведение равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета метода разность и деление равен: " + differenceAndDivision(10, 20));
        System.out.println("Сумма вычисления всех четырех операций из класса MathFunction: " + allOperations(10, 20));
    }
}
