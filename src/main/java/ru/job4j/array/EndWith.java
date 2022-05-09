package ru.job4j.array;

public class EndWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int index = 0; index < post.length; index++) {
            if (word[word.length - index - 1] != post[post.length - index - 1]) {
                return false;
            }
        }
        return true;
    }
}