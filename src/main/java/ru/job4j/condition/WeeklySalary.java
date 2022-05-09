package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < hours.length; i++) {
            int jobHours = hours[i];
            if ((i < 5) && (hours[i] < 9)) {
                salary += jobHours * 10;
            }
            if ((i < 5)  && (hours[i] > 8)) {
                salary += (jobHours - 8) * 15 + 8 * 10;
            }
            if ((i > 4 && i < 7)  && (hours[i] < 9)) {
                salary += jobHours * 20;
            }
            if ((i > 4 && i < 7)  && (hours[i] > 8)) {
                salary += (jobHours - 8) * 30 + 8 * 20;
            }
        }
        return salary;
    }

}







