package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double mat1 = Math.pow(a, 2);
        double mat2 = Math.pow(b, 2);
        double mat3 = mat1 + mat2;
        return Math.sqrt(mat3);
    }

    public static double optimal(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 10, 10, 20);
        System.out.println("The distance between two points in a coordinate system: " + result);
        double result2 = Point.optimal(100, 50, 1000, 2000);
        System.out.println("The distance between two points in a coordinate system: " + result2);
    }
}

