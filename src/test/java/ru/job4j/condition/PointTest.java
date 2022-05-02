package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when100150to200300then180dot27() {
        double expected = 180.27;
        int x1 = 100;
        int y1 = 150;
        int x2 = 200;
        int y2 = 300;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2550to7510then64dot03() {
        double expected = 64.03;
        int x1 = 25;
        int y1 = 50;
        int x2 = 75;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when101000to10000100000then99502dot76() {
        double expected = 99502.76;
        int x1 = 10;
        int y1 = 1000;
        int x2 = 10000;
        int y2 = 100000;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}