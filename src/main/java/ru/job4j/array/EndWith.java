package ru.job4j.array;

public class EndWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int index = 0; index < word.length; index++) {
            if (word[4] == post[1] && word[3] == post[0]) {
                return true;
            }
        }
        return result;
    }
}