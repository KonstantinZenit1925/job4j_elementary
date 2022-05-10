package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int summa = 0;

        for (int index = 0; index < array.length; index++) {
            for (int j = 0; j < array[index].length; j++) {
                summa += array[index][j];
            }
        }
        return summa;
    }

}

