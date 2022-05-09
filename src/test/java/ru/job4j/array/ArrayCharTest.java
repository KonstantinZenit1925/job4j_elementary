package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertFalse(result);
    }

    @Test
    public void whenStartWith1PrefixThenTrue() {
        char[] word = {'W', 'o', 'r', 'l', 'd'};
        char[] pref = {'W', 'o'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(result);
    }
}