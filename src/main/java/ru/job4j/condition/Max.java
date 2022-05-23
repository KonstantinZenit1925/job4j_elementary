package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = Math.max(left, right);
        System.out.println(result);
        return result;
    }

    public static int max(int a, int b, int c) {
        int result = 0;
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        if (c > a && c > b) {
            return c;
        }
        return result;
    }

    public static int max(int a, int b, int c, int d) {
        int result = 0;
        if (a > b && a > c && a > d) {
            return a;
        }
        if (b > a && b > c && b > d) {
            return b;
        }
        if (c > a && c > b && c > d) {
            return c;
        }
        if (d > a && d > b && d > c) {
            return d;
        }
        return result;
    }

}
