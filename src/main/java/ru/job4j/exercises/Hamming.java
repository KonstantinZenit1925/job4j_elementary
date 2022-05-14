package ru.job4j.exercises;

// Расстояние Хэмминга - это число позиций в которых соответствующие символы двух слов одинаковой длины различны.
//Например, сравнивая "101010111" и "111010100" мы должны получить - 3, поскольку не равны символы
// (отмечены жирным курсивом и подчеркиванием) - "101010111" и "111010100"
//Метод принимает 2 строки, всегда одинаковой длины. Необходимо определить для строки расстояние Хэмминга.
// Для этого в цикле последовательно необходимо сравнивать символы в строке.
// Для извлечения символа из строки используйте метод charAt(int index) класса String.
public class Hamming {
    public static int checkStrings(String left, String right) {
        int i = 0;
        int count = 0;
        while (i < left.length()) {
            if (left.charAt(i) != right.charAt(i)) {
             count++;
            }
            i++;
        }
        return count;
    }
}