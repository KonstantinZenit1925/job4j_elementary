package ru.job4j.exercises;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb1 = new StringBuilder();  // создаем объект класса стрингбилдер

        for (String i : s.split(" ")) {       // в цикле пробегаем по строкам стринга,
                                                   // через сплит определяем пробелы

            sb1.append(i.substring(0, 1).toUpperCase());  // склеиваем возвращаемое значение 0 и 1 индекса
        }                                             // преобразуем все знаки в данной строке в верхний регистр
        return sb1.toString();
    }

    public static void main(String[] args) {
        String s = "North Atlantic Treaty Organization";
        System.out.println(collect(s));
    }
}

