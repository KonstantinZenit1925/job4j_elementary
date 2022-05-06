package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int index = 0; index <= number; index++) {
            if (number % 5 == 0) {
                return true;
            }
        }
        return prime;
    }
}
