package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom10To100Then2530() {
        int start = 10;
        int finish = 100;
        int result = Counter.sumByEven(start, finish);
        int expected = 2530;
        Assert.assertEquals(expected, result);
    }

}