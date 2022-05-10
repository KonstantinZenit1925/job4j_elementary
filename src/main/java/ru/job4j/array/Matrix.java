package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {

        int[][] array = new int[size][size];

        for (int i = 1; i < array.length + 1; i++) {
            for (int j = 1; j < array[0].length + 1; j++) {
                int result = i * j;
                System.out.print(result + "\t");
            }
            System.out.println();
        }
        return array;
    }

    public static void main(String[] args) {
        multiple(9);
    }
}


