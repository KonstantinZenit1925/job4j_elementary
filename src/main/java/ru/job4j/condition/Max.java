package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        max(1, 2);
        max(2, 1);
        max(2, 2);
    }
}
