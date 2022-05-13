package ru.job4j.exercises;

public class Cryptography {
    public static String code(String s) {
        /* Cоздаем объект */
        StringBuilder str1 = new StringBuilder(s);

        /* Проверяем условие если входнач строка пуста */
        if (str1.length() <= 0) {
            s = "empty";
        }
        /* Проверяем условие если входная строка содержит больше 0
        и не более 4 символов - метод должен вернуть исходную строку.
         */
        if (str1.length() <= 4 && str1.length() > 0) {
            return s;
        }
        /* С помощью цикла проходимся от 5 символа до конца строки, и
        одновременно меняем все символы больше 5 на #
         */
        for (int index = str1.length() - 5; index >= 0; index--) {
           str1.setCharAt(index, '#');
           s = str1.toString();
        }
        return s;
    }
}
