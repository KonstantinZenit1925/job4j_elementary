package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (code >= 32 && code <= 127) {
                return false;
            }
        }
        return true;
    }
}

