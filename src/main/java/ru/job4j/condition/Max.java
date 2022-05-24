package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = Math.max(left, right);
        System.out.println(result);
        return result;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }
}
