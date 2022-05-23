package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To3To4Then4() {
        int a = 2;
        int b = 3;
        int c = 4;
        int result = Max.max(a, b, c);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To20To30To40Then40() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int result = Max.max(a, b, c, d);
        int expected = 40;
        Assert.assertEquals(result, expected);
    }

}