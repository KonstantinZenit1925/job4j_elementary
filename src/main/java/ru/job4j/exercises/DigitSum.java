package ru.job4j.exercises;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        for ( ; num > 0; num = num / 10) {
            sum += num % 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
}
