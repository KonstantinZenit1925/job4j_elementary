package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when100to00then10() {
        Point a = new Point(10, 0);
        Point b = new Point(0, 0);
        double expected = 10;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when05to00then10() {
        Point a = new Point(0, 5);
        Point b = new Point(0, 0);
        double expected = 5;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when015to50then15dot81() {
        Point a = new Point(0, 15);
        Point b = new Point(5, 0);
        double expected = 15.81;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}